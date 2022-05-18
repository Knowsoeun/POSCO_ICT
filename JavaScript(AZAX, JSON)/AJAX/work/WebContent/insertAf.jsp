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
String id = request.getParameter("id");
String pw = request.getParameter("pw");

String hobby[] = request.getParameterValues("hobby");
String age = request.getParameter("age");
String message = request.getParameter("message");
%>  

<h3>ID:<%=id %></h3>
<h3>Password:<%=pw %></h3>

<%
if(hobby != null && hobby.length > 0){
	for(int i = 0;i < hobby.length; i++){
	%>
		<h3>취미<%=i+1 %>:<%=hobby[i] %></h3>
	<%
	}
}
%>

<h3>연령대:<%=age %>대</h3>
<h3>하고싶은말:<%=message %></h3>


</body>
</html>



