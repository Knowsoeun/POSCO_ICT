<%@page import="dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String msg = request.getParameter("msg");

if(msg.equals("OK")){
	
	MemberDto dto = (MemberDto)session.getAttribute("login");
%>	
	<script type="text/javascript">
	alert("회원가입성공");
	location.href = "member?param=login";
	</script>
	<%
}else{
	%>
	<script type="text/javascript">
	alert("실패");
	location.href = "member?param=make";
	</script>
<%
}

%>


</body>
</html>