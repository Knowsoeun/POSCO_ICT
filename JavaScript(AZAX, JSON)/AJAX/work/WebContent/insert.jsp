<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insertAf.jsp" method="post">

아이디<input type="text" name="id" size="20" placeholder="아이디입력">
<br>
패스워드<input type="text" name="pw" size="20" placeholder="패스워드입력">
<br><br>

취미<br>
<input type="checkbox" name="hobby" id="hobby1" value="sleep">잠자기
<input type="checkbox" name="hobby" id="hobby2" value="sing">노래부르기
<input type="checkbox" name="hobby" id="hobby3" value="game">게임
<br><br>

연령대<br>
<input type="radio" name="age" value="10">10대
<input type="radio" name="age" value="20" checked="checked">20대
<input type="radio" name="age" value="30">30대
<input type="radio" name="age" value="40">40대
<input type="radio" name="age" value="50">50대
<input type="radio" name="age" value="60">60대
<br><br>

기타하고싶은말<br>
<textarea rows="10" cols="30" name="message"></textarea>
<br>

<input type="submit" value="전송">

</form>

</body>
</html>







