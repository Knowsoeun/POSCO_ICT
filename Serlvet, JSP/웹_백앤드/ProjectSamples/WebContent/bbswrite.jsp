<%@page import="dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
Object obj = session.getAttribute("login");
if(obj == null){
	%>
	<script>
	alert("로그인해 주십시오");
	location.href = "login.jsp";
	</script>	
	<%
}
MemberDto mem = (MemberDto)obj;
%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbswrite.jsp</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
th{
	background-color: #007bff;
	color: white;
}
</style>
</head>
<body>

<h2>글쓰기</h2>

<div align="center">
<div style="width: 1000px">

<form action="bbswriteAf.jsp" method="post">

<input type="hidden" name="id" value="<%=mem.getId() %>">

<table class="table table-bordered">
<col width="200"><col width="400">
<tr>
	<th>아이디</th>
	<td><%=mem.getId() %></td>
</tr>
<tr>
	<th>제목</th>
	<td>
		<input type="text" class="form-control" name="title" size="60">
	</td>
</tr>
<tr>
	<th>내용</th>
	<td>
		<textarea rows="20" class="form-control" name="content"></textarea>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<button type="submit" id="btn" class="btn btn-secondary">작성완료</button>
	</td>
</tr>
</table>

</form>
</div>
</div>

</body>
</html>





