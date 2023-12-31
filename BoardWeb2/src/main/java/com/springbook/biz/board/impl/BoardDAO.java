package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

import java.util.ArrayList;
import java.util.List;

@Repository("board_DAO")
public class BoardDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private final String BOARD_INSERT = "insert into board (seq, title, writer, content)"
			+ " values ((select nvl(max(seq), 0) + 1 from board), ?, ?, ?)";

	private final String BOARD_UPDATE = "update board set title = ?, content = ? where seq = ?";
	
	private final String BOARD_SELECT = "select * from board where seq = ?";
	
	private final String BOARD_LIST_SELECT = "select * from board order by seq desc";
	
	private final String BOARD_DELETE = "delete from board where seq = ?";
	
	private final String COUNT_UPDATE = "update board set cnt = ? where seq = ?";
	
	private final String BOARD_LIST_T = "select * from board where title like '%'||?||'%' order by seq desc";
	
	private final String BOARD_LIST_C = "select * from board where content like '%'||?||'%' order by seq desc";
	// CRUD 기능의 메소드 구현

	// 글 등록
	public void insert_board(BoardVO _vo) {
		conn = JDBCUtil.get_connection();

		try {
			psmt = conn.prepareStatement(BOARD_INSERT);

			psmt.setString(1, _vo.getTitle());
			psmt.setString(2, _vo.getWriter());
			psmt.setString(3, _vo.getContent());

			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt);
		}

	}

	// 글 수정
	public void update_board(BoardVO _vo) {
		conn = JDBCUtil.get_connection();

		try {
			psmt = conn.prepareStatement(BOARD_UPDATE);
			
			psmt.setString(1, _vo.getTitle());
			psmt.setString(2, _vo.getContent());
			psmt.setInt(3, _vo.getSeq());

			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt);
		}
	}
	
	// 글 삭제
	public void delete_board(BoardVO _vo) {
		conn = JDBCUtil.get_connection();
		
		try {
			psmt = conn.prepareStatement(BOARD_DELETE);
			
			psmt.setInt(1, _vo.getSeq());

			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt);
		}
	}
	
	// 글 상세 조회
	public BoardVO select_board(BoardVO _vo) {
		conn = JDBCUtil.get_connection();
		BoardVO board = null;
		
		try {
			psmt = conn.prepareStatement(BOARD_SELECT);
			psmt.setInt(1, _vo.getSeq());
			
			rs = psmt.executeQuery();
			if (rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt(1));
				board.setTitle(rs.getString(2));
				board.setWriter(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setReg_date(rs.getDate(5));
				board.setCnt(rs.getInt(6));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt, rs);
		}
		
		return board;
	}
	
	// 글 목록 조회
	public List<BoardVO> select_board_list(BoardVO _vo) {
		conn = JDBCUtil.get_connection();
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			//psmt = conn.prepareStatement(BOARD_LIST_SELECT);
			if (_vo.getSearchCondition().equals("TITLE")) {
				psmt = conn.prepareStatement(BOARD_LIST_T);
			} else if (_vo.getSearchCondition().equals("CONTENT")) {
				psmt = conn.prepareStatement(BOARD_LIST_C);
			}
			
			psmt.setString(1, _vo.getSearchKeyword());
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				BoardVO board = new BoardVO();
				
				board.setSeq(rs.getInt(1));
				board.setTitle(rs.getString(2));
				board.setWriter(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setReg_date(rs.getDate(5));
				board.setCnt(rs.getInt(6));
				
				list.add(board);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt, rs);
		}
		
		return list;
	}
	
	public void update_cnt(BoardVO _vo) {
		conn = JDBCUtil.get_connection();
		
		try {
			psmt = conn.prepareStatement(COUNT_UPDATE);
			psmt.setInt(1, _vo.getCnt());
			psmt.setInt(2, _vo.getSeq());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt);
		}
	}
}
