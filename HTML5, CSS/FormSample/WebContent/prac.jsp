<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	System.out.println("name: " + name);
	
	String eng = request.getParameter("eng");
	System.out.println("english: " + eng);
	
	String lang[] = request.getParameterValues("lang");
	if (lang!=null&&lang.length>0){
		for (String str:lang){
			System.out.println("관심과목: "+str);
		}
	}
	String writer = request.getParameter("writer");
	System.out.println("의견: " + writer);
	
	String age = request.getParameter("age");
	System.out.println("나이: " + age);
	%>
</body>
</html>