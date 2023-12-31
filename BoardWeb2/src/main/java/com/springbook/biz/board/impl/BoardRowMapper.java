package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbook.biz.board.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO>{

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		BoardVO board = new BoardVO();
		
		board.setSeq(rs.getInt(1));
		board.setTitle(rs.getString(2));
		board.setWriter(rs.getString(3));
		board.setContent(rs.getString(4));
		board.setReg_date(rs.getDate(5));
		board.setCnt(rs.getInt(6));
		
		return board;
	}

}
