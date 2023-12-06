package com.springbook.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	
	// 글 등록
	@RequestMapping(value = "/InsertBoard.do")
	public String insert_board(BoardVO vo, BoardDAO dao) {

		System.out.println("글 등록 처리");

		dao.insert_board(vo);
		
		return "redirect:GetBoardList.do";
	}
	
	// 수정
	@RequestMapping (value = "/UpdateBoard.do")
	public String update_board(BoardVO vo, BoardDAO dao) {
		
		System.out.println("글 수정 처리");

		dao.update_board(vo);
		
		return "redirect:GetBoardList.do";
	}
	
	// 삭제
	@RequestMapping (value = "/DeleteBoard.do")
	public String delete_board(BoardVO vo, BoardDAO dao) {
		
		System.out.println("글 삭제 처리");
			
		dao.delete_board(vo);	
		
		return "redirect:GetBoardList.do";
	}
	
	// 조회
	@RequestMapping (value = "/GetBoard.do")
	public String get_board(BoardVO vo, BoardDAO dao, Model model) {
		
		System.out.println("글 상세 조회 처리");
		
		BoardVO board = dao.select_board(vo);

		model.addAttribute("board", board);
		
		return "./GetBoard.jsp";
	}
	
	// 목록 조회
	@RequestMapping(value = "/GetBoardList.do")
	public String get_board_list(BoardVO vo, BoardDAO dao, Model model) {
		
		System.out.println("글 목록 검색 처리");

		List<BoardVO> board_list = dao.select_board_list();

		model.addAttribute("board_list", board_list);
		
		return "GetBoardList.jsp";
	}
}