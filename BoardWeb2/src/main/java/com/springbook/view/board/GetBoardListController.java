package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


//@Controller
public class GetBoardListController {

	@RequestMapping(value = "/GetBoardList.do")
	public ModelAndView get_board_list(BoardVO vo, BoardDAO dao, ModelAndView mav) {
		
		System.out.println("글 목록 검색 처리");
		
//		BoardVO vo = new BoardVO();
//		BoardDAO dao = new BoardDAO();
		List<BoardVO> board_list = dao.select_board_list(vo);
//				
////		HttpSession session = _req.getSession();
////		session.setAttribute("board_list", board_list);
////		_resp.sendRedirect("./GetBoardList.jsp");
//		
//		ModelAndView mav = new ModelAndView();
		mav.addObject("board_list", board_list);
		mav.setViewName("GetBoardList.jsp");
		
		return mav;
	}

}
