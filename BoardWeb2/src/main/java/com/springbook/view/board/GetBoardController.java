package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController {

	@RequestMapping (value = "/GetBoard.do")
	public ModelAndView get_board(BoardVO vo, BoardDAO dao, ModelAndView mav) {
		
		System.out.println("글 상세 조회 처리");
		
//		BoardVO vo = new BoardVO();
//		BoardDAO dao = new BoardDAO();
//		String seq = _req.getParameter("seq");
//		
//		vo.setSeq(Integer.parseInt(seq));
		BoardVO board = dao.select_board(vo);
//		
//		ModelAndView mav = new ModelAndView();
		mav.addObject("board", board);
		mav.setViewName("./GetBoard.jsp");
		
//		HttpSession session = _req.getSession();
//		session.setAttribute("board", board);
//		_resp.sendRedirect("./GetBoard.jsp");
		
		return mav;
	}

}
