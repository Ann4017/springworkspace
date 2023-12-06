package com.springbook.view.board;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class InsertBoardController {

	@RequestMapping(value = "/InsertBoard.do")
	public String insert_board(BoardVO vo, BoardDAO dao) {

		System.out.println("글 등록 처리");

//		BoardVO vo = new BoardVO();
//		BoardDAO dao = new BoardDAO();

//		String title = _req.getParameter("title");
//		String writer = _req.getParameter("writer");
//		String content = _req.getParameter("content");
//
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);
		dao.insert_board(vo);
		
		return "redirect:GetBoardList.do"; // 기본적으로 forward 방식 이동
	}

}
