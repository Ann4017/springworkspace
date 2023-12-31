<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h1>글 목록</h1>
		<h3>
			test 님 환영합니다.<a href="Logout.do">Logout</a>
		</h3>

		<form action="GetBoardList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">제목
							<option value="CONTENT">내용
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="검색" /></td>
				</tr>
			</table>
		</form>

		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
				<th bgcolor="orange" width="100">조회수</th>
			</tr>

			<c:forEach items="${board_list }" var="board" >
				<tr>
					<td>${board.seq }</td>
					<td><a href="GetBoard.do?seq=${board.seq}">${board.title}</a></td>
					<td>${board.writer }</td>
					<td>${board.reg_date }</td>
					<td>${board.cnt }</td>
				</tr>
			</c:forEach>
		</table>

		<br> <a href="InsertBoard.jsp">글 작성</a>
	</div>


</body>
</html>