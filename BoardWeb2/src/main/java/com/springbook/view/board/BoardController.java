package com.springbook.view.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.board.impl.BoardServiceImpl;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardServiceImpl board_service;
	
	// 검색 조건 설정
	@ModelAttribute("condition_map") // @RequestMapping이 적용 된 메소드보다 @ModelAttribute이 적용 된 메소드가 먼저 실행된다
	public Map<String, String> search_condition_map() {
		
		Map<String, String> condition_map = new HashMap<String, String>();
		condition_map.put("제목", "TITLE");
		condition_map.put("내용", "CONTENT");
		
		return condition_map;
	}
	
	// json 처리
	@RequestMapping(value = "/dataTransform.do")
	@ResponseBody  // json 형식의 데이터를 리턴하기 위해서
	public List<BoardVO> dataTransform(BoardVO vo) {
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		
		List<BoardVO> boardList = board_service.select_board_list(vo);
		
		return boardList;
	}

	// 글 등록
	@RequestMapping(value = "/InsertBoard.do")
	public String insert_board(BoardVO vo) throws IllegalStateException, IOException {

		System.out.println("글 등록 처리");
		
		MultipartFile uploadFile = vo.getUploadFile();
		
		if (!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("D:/" + fileName));
		}

		board_service.insert_board(vo);

		return "redirect:GetBoardList.do";
	}

	// 수정
	@RequestMapping(value = "/UpdateBoard.do")
	public String update_board(@ModelAttribute("board") BoardVO vo) {

		System.out.println("글 수정 처리");
		System.out.println("작성자 : " + vo.getWriter());
		System.out.println("날짜 : " + vo.getReg_date());
		System.out.println();
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("내용 : " + vo.getContent());
		board_service.update_board(vo);

		return "redirect:GetBoardList.do";
	}

	// 삭제
	@RequestMapping(value = "/DeleteBoard.do")
	public String delete_board(BoardVO vo) {

		System.out.println("글 삭제 처리");

		board_service.delete_board(vo);

		return "redirect:GetBoardList.do";
	}

	// 조회
	@RequestMapping(value = "/GetBoard.do")
	public String get_board(BoardVO vo, Model model) {

		System.out.println("글 상세 조회 처리");

		BoardVO board = board_service.select_board(vo);

		model.addAttribute("board", board);

		return "./GetBoard.jsp";
	}

	// 목록 조회
	@RequestMapping(value = "/GetBoardList.do")
	public String get_board_list(BoardVO vo, Model model) {

		System.out.println("글 목록 검색 처리");
		
		if (vo.getSearchCondition() == null) {
			vo.setSearchCondition("TITLE");
		}		
		if (vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}

		List<BoardVO> board_list = board_service.select_board_list(vo);

		model.addAttribute("board_list", board_list);

		return "GetBoardList.jsp";
	}
	
//	@RequestMapping(value = "/GetBoardList.do")
//	public String get_board_list(
//			@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
//			@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
//			BoardVO vo, BoardDAO dao, Model model) {
//		
//		System.out.println(condition);
//		System.out.println(keyword);
//		
//		System.out.println("글 목록 검색 처리");
//		
//		List<BoardVO> board_list = dao.select_board_list();
//		
//		model.addAttribute("board_list", board_list);
//		
//		return "GetBoardList.jsp";
//	}
}
