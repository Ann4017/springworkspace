<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%	
	request.setCharacterEncoding("utf-8");

	BoardVO vo = new BoardVO();
	BoardDAO dao = new BoardDAO();
	
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	dao.insert_board(vo);

	response.sendRedirect("./GetBoardList.jsp");
%>