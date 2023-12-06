package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {

	@RequestMapping (value = "/UpdateBoard.do")
	public String update_board(BoardVO vo, BoardDAO dao) {
		
		System.out.println("글 수정 처리");
		
//		BoardVO vo = new BoardVO();
//		BoardDAO dao = new BoardDAO();
//		
//		String seq = _req.getParameter("seq");
//		String title =_req.getParameter("title");
//		String content = _req.getParameter("content");
//		
//		vo.setSeq(Integer.parseInt(seq));
//		vo.setTitle(title);
//		vo.setContent(content);
//		
		dao.update_board(vo);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("./GetBoardList.do");
		
		return "redirect:GetBoardList.do";
	}

}
