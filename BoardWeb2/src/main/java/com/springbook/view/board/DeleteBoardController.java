package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//@Controller
public class DeleteBoardController{
	@RequestMapping (value = "/DeleteBoard.do")
	public String delete_board(BoardVO vo, BoardDAO dao) {
		
		System.out.println("글 삭제 처리");
		
//		BoardVO vo = new BoardVO();
//		BoardDAO dao = new BoardDAO();
//		
//		String seq = _req.getParameter("seq");
//		
//		vo.setSeq(Integer.parseInt(seq));
//		
		dao.delete_board(vo);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("./GetBoardList.do");
//		
		return "redirect:GetBoardList.do";
	}
}
