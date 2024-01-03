package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD 기능의 메소드 구현
	
	// 글 등록
	void insert_board(BoardVO _vo);	
	// 글 수정 
	void update_board(BoardVO _vo);
	// 글 삭제 
	void delete_board(BoardVO _vo);
	// 글 상세 조회
	BoardVO select_board(BoardVO _vo);
	// 글 전체 조회
	List<BoardVO> select_board_list(BoardVO _vo);
}
