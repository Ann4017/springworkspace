<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate(); // 세션에 있는 모든 데이터를 지움
	
	response.sendRedirect("./Login.jsp");
	
%>