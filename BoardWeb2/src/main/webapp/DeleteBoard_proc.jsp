<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>

<%
	BoardVO vo = new BoardVO();
	BoardDAO dao = new BoardDAO();
	
	String seq = request.getParameter("seq");
	
	vo.setSeq(Integer.parseInt(seq));
	dao.delete_board(vo);
	
	response.sendRedirect("./GetBoardList.jsp");
	
%>