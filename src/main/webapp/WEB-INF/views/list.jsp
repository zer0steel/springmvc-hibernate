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
<table>
	<thead>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>조회수</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="p" items="${list }">
		<tr>
			<td>${p.id }</td>
			<td><a href="detail.do?id=${p.id }">${p.title }</a></td>
			<td>${p.writer }</td>
			<td>${p.regdate }</td>
			<td>${p.hit }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="insert.do">글쓰기</a>
<a href="join.do">회원가입</a>
<button>클릭</button>
<script type="text/javascript">
$('button').click(function() {
	let users = [
		{name : '장영철', age : 28},
		{name : '최정민', age : 25},
		{name : '손인주', age : 25},
		{name : '최수진', age : 27}]
	$.ajax({
		url:'ajax.do',
		data:{users:users},
		dataType: "json",
		type:'post'
	}).done(function() {
		
	});
})
</script>
</body>
</html>