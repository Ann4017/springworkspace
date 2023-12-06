package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

@Repository("user_dao")
public class UserDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private String SELECT_USER = "select * from users where id = ? and password = ?";
	
	// CRUD 메소드 구현
	// 회원 조회
	public UserVO select_user(UserVO _vo) {
		
		conn = JDBCUtil.get_connection();
		UserVO user = null;
		
		try {
			psmt = conn.prepareStatement(SELECT_USER);
			psmt.setString(1, _vo.getId());
			psmt.setString(2, _vo.getPassword());
			
			rs = psmt.executeQuery();
			if (rs.next()) {
				user = new UserVO();
				user.setId(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setName(rs.getString(3));
				user.setRole(rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, psmt, rs);
		}
		
		return user;
	}
}
