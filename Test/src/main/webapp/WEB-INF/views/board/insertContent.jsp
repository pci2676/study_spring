<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<head>
    <title>게시판</title>
</head>
<body>
<h1>
    게시판 등록하기  
</h1>
    
    <form action="/board/insertContent" method="POST">
        <div class="insertForm">
            <label >제목</label>
            <input type="text" name="bId" class="insertForm" placeholder = "제목">
        </div>
        <div class="insertForm">
            <label >내용</label>
            <textarea rows="4" cols="15" name="bContent" class="insertForm" placeholder = "내용"></textarea>
        </div>
        <div class="insertForm">
            <label >작성자</label>
            <input type="text" name="bName" class="insertForm" placeholder = "작성자">
        </div>
        
        <div class="Formfooter">
                <button type="submit" class="btn_button">작성하기</button>
        </div>            
        
    </form>

</body>
</html>