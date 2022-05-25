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
String pass = request.getParameter("pass");

if(pass.equals("OK")){
	
	MemberDto dto = (MemberDto)session.getAttribute("login");
%>	
	<script type="text/javascript">
	alert("안녕하세요 <%=dto.getId() %>님");
	location.href = "member?param=login";
	</script>
	<%
}else{
	%>
	<script type="text/javascript">
	alert("id나 password를 확인하세요");
	location.href = "member?param=login";
	</script>
<%
}

%>


</body>
</html>