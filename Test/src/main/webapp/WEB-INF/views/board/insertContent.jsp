<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<head>
    <title>�Խ���</title>
</head>
<body>
<h1>
    �Խ��� ����ϱ�  
</h1>
    
    <form action="/board/insertContent" method="POST">
        <div class="insertForm">
            <label >����</label>
            <input type="text" name="bId" class="insertForm" placeholder = "����">
        </div>
        <div class="insertForm">
            <label >����</label>
            <textarea rows="4" cols="15" name="bContent" class="insertForm" placeholder = "����"></textarea>
        </div>
        <div class="insertForm">
            <label >�ۼ���</label>
            <input type="text" name="bName" class="insertForm" placeholder = "�ۼ���">
        </div>
        
        <div class="Formfooter">
                <button type="submit" class="btn_button">�ۼ��ϱ�</button>
        </div>            
        
    </form>

</body>
</html>