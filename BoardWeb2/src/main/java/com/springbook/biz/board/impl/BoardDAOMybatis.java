package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;

	// 글 등록
	public void insert_board(BoardVO vo) {

		System.out.println("mybits");
		mybatis.insert("BoardDAO.insertBoard");
		mybatis.commit();
	}

	// 글 수정
	public void update_board(BoardVO vo) {

		System.out.println("mybits");
		mybatis.update("BoardDAO.updateBoard");
		mybatis.commit();
	}

	// 글 삭제
	public void delete_board(BoardVO vo) {

		System.out.println("mybits");
		mybatis.delete("BoardDAO.deleteBoard");
		mybatis.commit();
	}

	// 글 상세 조회
	public BoardVO select_board(BoardVO vo) {

		System.out.println("mybits");
		return (BoardVO) mybatis.selectOne("BoardDAO.selectBoard", vo);
	}

	// 글 목록 조회
	public List<BoardVO> select_board_list(BoardVO vo) {

		System.out.println("mybits");
		return mybatis.selectList("BoardDAO.selectBoardList", vo);
	}
}
