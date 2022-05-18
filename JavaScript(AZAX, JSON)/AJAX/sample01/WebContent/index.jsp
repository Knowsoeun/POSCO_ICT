<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- html 주석문 -->

<%-- JSP 주석문 --%> 

<%--
		JSP : 	Java Server Page
				Server를 통해서 Client form을 만들어 내는 코드
				 
		내장(암기)객체 : new(생성)를 하지 않고 바로 사용이 가능한 class
						request
						HttpServletRequest	
						
				Servlet: java(html)
				JSP: html(java) 	
				
				java -> Server
				html, javascript -> Client
								
 --%>

<h3>Hello JSP</h3>

<%
	// java 영역
	// scriptlet = script + applet

	System.out.println("hello JSP");
%>

<%
	String str = "Hello JSP";
%>

<p>str:<%=str %></p>

<input type="text" size="20" value="<%=str %>">
<br>

<%
	// java -> form(web)
	out.println("<h3>str:" + str + "</h3>");
%>

<%
	for(int i = 0;i < 5; i++){
%>
		<p>p tag <%=i %>번째</p>
<%
	}
%>

<script type="text/javascript">

let s = "<%=str %>";

console.log(s);

</script>






</body>
</html>






