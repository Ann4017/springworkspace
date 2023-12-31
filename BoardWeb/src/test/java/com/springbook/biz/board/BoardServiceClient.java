package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardServiceImpl;

public class BoardServiceClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService board_service = (BoardService) factory.getBean("board_service");
		BoardVO vo = new BoardVO();
		
//			vo.setTitle("제목");
//			vo.setWriter("홍길동");
//			vo.setContent("내용");
//			board_service.insert_board(vo);
		
//		vo.setTitle("수정 된 제목");
//		vo.setContent("수정 된 내용");
//		vo.setSeq(1);
//		board_service.update_board(vo);
		
//		vo.setSeq(1);
//		vo = board_service.select_board(vo);
//		System.out.println(vo);
		
		List<BoardVO> list = board_service.select_board_list();
		for (BoardVO board : list) {			
			System.out.println(board);
		}

	}


}
