<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경고</title>
</head>
<body>
<script type="text/javascript">
	var message = '${message}'; 
	var url = '${url}'; 
	alert(message);
	document.location.href = url;
</script>
</body>
</html>