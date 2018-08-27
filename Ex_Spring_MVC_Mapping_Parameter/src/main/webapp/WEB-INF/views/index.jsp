<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
</head>
<body>
	<h1>Index Page</h1>
	<form action="student" method="get">
		<p>
			name : <input name="name" type="text">
		</p>
		<p>
			<input type="submit" value="전송">
		</p>
	</form>


	<form action="studentInformation" method="post">
		<p>
			name: <input name="name" type="text">
		</p>
		<p>
			age: <input name="age" type="text">
		</p>
		<p>
			grade: <input name="grade" type="text">
		</p>
		<input type="submit" value="전송">
	</form>
</body>
</html>