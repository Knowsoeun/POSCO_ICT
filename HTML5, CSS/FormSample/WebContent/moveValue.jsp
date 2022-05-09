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


	//String hobby=request.getParameter("hobby");
	//System.out.println("hobby: "+hobby);
	String hobby[]=request.getParameterValues("hobby");
	for (int i=0;i<hobby.length; i++){
		System.out.println("hobby["+i+"] = "+hobby[i]);
	}
%>
</body>
</html>