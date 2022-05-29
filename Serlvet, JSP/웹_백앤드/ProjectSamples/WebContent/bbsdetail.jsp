<%@page import="dto.MemberDto"%>
<%@page import="dto.BbsDto"%>
<%@page import="dao.BbsDao"%>
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
    
<%
int seq = Integer.parseInt( request.getParameter("seq") );

BbsDao dao = BbsDao.getInstance();
dao.readcount(seq);
BbsDto dto = dao.getBbs(seq);

// 조회수 증가
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
th{
	background-color: #007bff;
	color: white;
}
pre { /* 자동줄바꿈 설정 */
  	white-space: pre-wrap;
    word-break: break-all;
    overflow: auto;
}
</style>

</head>
<body>

<h2>상세 글 보기</h2>

<div id="app" class="container">

<table class="table table-striped">
<col width="150"><col width="500">

<tr>
	<th>작성자</th>
	<td><%=dto.getId() %></td>
</tr>
<tr>
	<th>작성일</th>
	<td><%=dto.getWdate() %></td>
</tr>
<tr>
	<th>조회수</th>
	<td><%=dto.getReadcount() %></td>	
</tr>
<tr>
	<th>정보</th>
	<td><%=dto.getRef() %>-<%=dto.getStep() %>-<%=dto.getDepth() %></td>
</tr>
<tr>
	<!-- <th>제목</th>	 -->
	<td colspan="2" id="title" style="font-size: 22px; font-weight:bold;"><%=dto.getTitle() %></td>	
</tr>
<tr>
	<!-- <th>내용</th> -->
	<%-- <td>
		<textarea rows="15" cols="90" readonly="readonly"><%=dto.getContent() %></textarea>
	</td> --%>	
	
	<td colspan="2" style="background-color: white;">
		<pre id="content" style="font-size: 20px; 
			font-family: 고딕,arial;background-color: white;"><%=dto.getContent() %></pre>
	</td>	
</tr>

</table>

<br>
<button type="button" onclick="answerBbs(<%=dto.getSeq() %>)" class="btn btn-primary">댓글</button>
<button type="button" onclick="location.href='bbslist.jsp'" class="btn btn-primary">글목록</button>

<%
if(dto.getId().equals(mem.getId())){
%>
<button type="button" onclick="updateBbs(<%=dto.getSeq() %>)" class="btn btn-primary">수정</button>
<button type="button" onclick="deleteBbs(<%=dto.getSeq() %>)" class="btn btn-primary">삭제</button>
<%
}
%>


<br><br>

<table>
<col width="1500px"><col width="150">
<tr>
<td>comment</td><td style="padding-left: 30px"></td>
</tr>
<tr>
	<td>
		<textarea rows="3" class="form-control" id="commentContent"></textarea>
	</td>
	<td style="padding-left: 30px">		
		<button type="button" class="btn btn-primary btn-block p-4" id="commentBtn">완료</button>
	</td>
</tr>
</table>
</div>

<script type="text/javascript">
function answerBbs( seq ) {
	location.href = "answer.jsp?seq=" + seq;
}
function updateBbs( seq ) {
	location.href = "bbsupdate.jsp?seq=" + seq;
}
function deleteBbs( seq ) {
	location.href = "bbsdelete.jsp?seq=" + seq;
}

</script>




</body>
</html>




