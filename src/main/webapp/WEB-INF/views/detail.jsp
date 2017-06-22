<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>글쓴이 : ${p.writer }</td>
		<td>등록일 : ${p.regdate }</td>
		<td>조회수 : ${p.hit }</td>
	</tr>
	<tr>
		<td colspan="3">
			<h2>${p.title }</h2>
			<textarea rows="8" cols="80" readonly>${p.content }</textarea>
		</td>
	</tr>
</table>
<a href="list.do">목록으로</a>
<a href="update.do?id=${p.id}">수정</a>
<a href="delete.do?id=${p.id}">삭제</a>
</body>
</html>