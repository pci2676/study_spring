<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="modify" method="post">
		<input type="hidden" name="bId" value="${content_view.bId}">
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>��ȣ</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>��Ʈ</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="bName" size="50"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="bTitle" size="50"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="bContent" size="10"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="����">&nbsp;&nbsp;<a
					href="list">�� ���</a>&nbsp;&nbsp;<a
					href="delete?bId=${content_view.bId}">�� ����</a>&nbsp;&nbsp;<a
					href="reply?bId=${content_view.bId}">�亯�ϱ�</a></td>
			</tr>

		</table>
	</form>
</body>
</html>