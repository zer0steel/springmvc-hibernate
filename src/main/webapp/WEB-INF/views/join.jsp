<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js" 
	integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<form action="join.do" method="post">
	아이디 : <input type="text" name="memberId" required><br>
	비밀번호 : <input type="password" name="pwd" required><br>
	<input type="submit" value="등록">
	<a href="list.do">목록으로</a>
</form>
</body>
</html>