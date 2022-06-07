<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
   <title>Home</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <meta charset="UTF-8" />
</head>
<body>
<h1>
	글 생성하기
</h1>

<form method="POST">
	<p>제목 : <input type="text" name="title" /></p>
	<p>본문 : <input type="text" name="content" /></p>
	<p>유저 : <input type="text" name="user" /></p>
	<input type="submit" value="저장" />
</form>

</body>
</html>
