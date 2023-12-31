package com.springbook.biz.board.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

@Repository("board_DAO_spring")
public class BoardDAOSpring {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private final String BOARD_INSERT = "insert into board (seq, title, writer, content)"
			+ " values ((select nvl(max(seq), 0) + 1 from board), ?, ?, ?)";

	private final String BOARD_UPDATE = "update board set title = ?, content = ? where seq = ?";
	
	private final String BOARD_SELECT = "select * from board where seq = ?";
	
	private final String BOARD_LIST_SELECT = "select * from board order by seq desc";
	
	private final String BOARD_DELETE = "delete from board where seq = ?";
	
	
	
	// 글 등록
		public void insert_board(BoardVO _vo) {
			System.out.println("jdbc spring insert");
			
			jdbcTemplate.update(BOARD_INSERT, _vo.getTitle(), _vo.getWriter(), _vo.getContent());
		}

		// 글 수정
		public void update_board(BoardVO _vo) {
			System.out.println("jdbc spring update");
			
			jdbcTemplate.update(BOARD_UPDATE, _vo.getTitle(), _vo.getContent(), _vo.getSeq());
		}
		
		// 글 삭제
		public void delete_board(BoardVO _vo) {
			System.out.println("jdbc spring delete");
			
			jdbcTemplate.update(BOARD_DELETE, _vo.getSeq());
		}
		
		// 글 상세 조회
		public BoardVO select_board(BoardVO _vo) {
			System.out.println("jdbc spring select");
			
			Object[] args = {_vo.getSeq()};
	
			return jdbcTemplate.queryForObject(BOARD_SELECT, args, new BoardRowMapper());
		}
		
		// 글 목록 조회
		public List<BoardVO> select_board_list() {
			System.out.println("jdbc spring select list");
			
			return jdbcTemplate.query(BOARD_LIST_SELECT, new BoardRowMapper());
		}
}
