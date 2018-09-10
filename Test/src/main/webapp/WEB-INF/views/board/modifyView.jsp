<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="modify" method="post">
	<input type="hidden" name="bId" value="${BDto.bId}"/>
	<input type="hidden" name="bTitle" value="${BDto.bTitle}"/>
	<input type="hidden" name="bName" value="${BDto.bName}"/>
		<table class="table table-board" border="1px" width="80%"
			align="center">
			<tr>
				<td>글 번호</td>
				<td>${BDto.bId}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${BDto.bTitle}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${BDto.bName}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="bContent" value="${BDto.bContent}"/></td>
			</tr>
			<tr>
				<td>
					<button type="submit">수정</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>