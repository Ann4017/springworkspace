<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	

	BoardVO vo = new BoardVO();
	BoardDAO dao = new BoardDAO();
	String seq = request.getParameter("seq");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	vo.setSeq(Integer.parseInt(seq));
	vo.setTitle(title);
	vo.setContent(content);
	
	dao.update_board(vo);

	response.sendRedirect("./GetBoardList.jsp");
%>