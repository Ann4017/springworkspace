<%@page import="com.springbook.biz.user.UserVO"%>
<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO dao = new UserDAO();
	UserVO user = dao.select_user(vo);
	
	if (user != null) {
		response.sendRedirect("./GetBoardList.jsp");
	} else {
		response.sendRedirect("./Login.jsp");
	}
%>