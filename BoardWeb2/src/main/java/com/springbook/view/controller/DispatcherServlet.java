package com.springbook.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		process(_req, _resp);
		
	}

	protected void doPost(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		_req.setCharacterEncoding("utf-8");
		process(_req, _resp);
	}

	protected void process(HttpServletRequest _req, HttpServletResponse _resp) throws ServletException, IOException {
		String uri = _req.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		
		if (path.equals("/Login.do")) {
			System.out.println("로그인 처리");
			
			String id = _req.getParameter("id");
			String password = _req.getParameter("password");
			
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);
			
			UserDAO dao = new UserDAO();
			UserVO user = dao.select_user(vo);
			
			if (user != null) {
				_resp.sendRedirect("./GetBoardList.do");
			} else {
				_resp.sendRedirect("./Login.jsp");
			}
			
		} else if (path.equals("/Logout.do")) {
			System.out.println("로그아웃 처리");
			
			HttpSession session = _req.getSession();
			session.invalidate();
			
			_resp.sendRedirect("./Login.jsp");
			
		} else if (path.equals("/InsertBoard.do")) {
			System.out.println("글 등록 처리");
			_req.setCharacterEncoding("utf-8");
			
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			
			String title =_req.getParameter("title");
			String writer = _req.getParameter("writer");
			String content = _req.getParameter("content");
			
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);			
			dao.insert_board(vo);
			
			_resp.sendRedirect("./GetBoardList.do");
			
		} else if (path.equals("/UpdateBoard.do")) {
			System.out.println("글 수정 처리");
			
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			
			String seq = _req.getParameter("seq");
			String title =_req.getParameter("title");
			String content = _req.getParameter("content");
			
			vo.setSeq(Integer.parseInt(seq));
			vo.setTitle(title);
			vo.setContent(content);
			
			dao.update_board(vo);
			
			_resp.sendRedirect("./GetBoardList.do");
			
		} else if (path.equals("/DeleteBoard.do")) {
			System.out.println("글 삭제 처리");
			
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			String seq = _req.getParameter("seq");
			
			vo.setSeq(Integer.parseInt(seq));
			dao.delete_board(vo);
			_resp.sendRedirect("./GetBoardList.do");
			
		} else if (path.equals("/GetBoard.do")) {
			System.out.println("글 상세 조회 처리");
			
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			String seq = _req.getParameter("seq");
			
			vo.setSeq(Integer.parseInt(seq));
			BoardVO board = dao.select_board(vo);
			
			HttpSession session = _req.getSession();
			session.setAttribute("board", board);
			_resp.sendRedirect("./GetBoard.jsp");
			
		} else if (path.equals("/GetBoardList.do")) {
			System.out.println("글 목록 검색 처리");
			
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			List<BoardVO> board_list = dao.select_board_list(vo);
			
			HttpSession session = _req.getSession();
			session.setAttribute("board_list", board_list);
			_resp.sendRedirect("./GetBoardList.jsp");
		}
		
	}
}
