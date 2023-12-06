package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection get_connection() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pwd = "tiger";

			return DriverManager.getConnection(url, id, pwd);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void close(Connection _conn, PreparedStatement _psmt) {
		if (_psmt != null) {
			try {
				if (!_psmt.isClosed()) {
					_psmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				_psmt = null;
			}
		}

		if (_conn != null) {
			try {
				if (!_conn.isClosed()) {
					_conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				_conn = null;
			}
		}
	}

	public static void close(Connection _conn, PreparedStatement _psmt, ResultSet _rs) {
		if (_rs != null) {
			try {
				if (!_rs.isClosed()) {
					_rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				_rs = null;
			}
		}

		if (_psmt != null) {
			try {
				if (!_psmt.isClosed()) {
					_psmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				_psmt = null;
			}
		}

		if (_conn != null) {
			try {
				if (!_conn.isClosed()) {
					_conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				_conn = null;
			}
		}

	}
}
