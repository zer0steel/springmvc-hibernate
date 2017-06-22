<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert.do" method="post">
	제목 : <input type="text" name="title" required><br>
	작성자 : <input type="text" name="writer" required><br>
	<textarea rows="8" cols="80" name="content" required></textarea><br>
	<input type="submit" value="등록"><a href="list.do">목록으로</a>
</form>
</body>
</html>