package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.BoardVO;

import com.springbook.biz.util.SqlSessionFactoryBean;

public class BoardDAO2 {
	private SqlSession mybtis;

	public BoardDAO2() {
	
		mybtis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	// 글 등록
	public void insert_board(BoardVO vo) {

		System.out.println("mybits");
		mybtis.insert("BoardDAO.insertBoard");
		mybtis.commit();
	}

	// 글 수정
	public void update_board(BoardVO vo) {

		System.out.println("mybits");
		mybtis.update("BoardDAO.updateBoard");
		mybtis.commit();
	}

	// 글 삭제
	public void delete_board(BoardVO vo) {

		System.out.println("mybits");
		mybtis.delete("BoardDAO.deleteBoard");
		mybtis.commit();
	}

	// 글 상세 조회
	public BoardVO select_board(BoardVO vo) {
		
		System.out.println("mybits");
		return (BoardVO) mybtis.selectOne("BoardDAO.selectBoard", vo);
	}

	// 글 목록 조회
	public List<BoardVO> select_board_list(BoardVO vo) {
		
		System.out.println("mybits");
		return mybtis.selectList("BoardDAO.selectBoardList", vo);
	}

	public void update_cnt(BoardVO vo) {

	}

}
