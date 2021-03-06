<%@page import="dto.BbsDto"%>
<%@page import="java.util.List"%>
<%@page import="dao.BbsDao"%>
<%@page import="dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!// 댓글용 depth와 image를 추가하는 함수
	public String arrow(int depth) {
		String rs = "<img src='image/arrow.png' width='20px' height='20px'/>";
		String nbsp = "&nbsp;&nbsp;&nbsp;&nbsp;";

		String ts = "";
		for (int i = 0; i < depth; i++) {
			ts += nbsp;
		}

		return depth == 0 ? "" : ts + rs;
	}%>


<%
Object obj = session.getAttribute("login");
if (obj == null) {
%>
<script>
	alert("로그인해 주십시오");
	location.href = "login.jsp";
	</script>
<%
}

MemberDto mem = (MemberDto) obj;
%>

<%
String sPageNumber = request.getParameter("pageNumber");
int pageNumber = 0;
if (sPageNumber != null && sPageNumber.equals("") == false) {
	pageNumber = Integer.parseInt(sPageNumber);
}

String choice = request.getParameter("choice");
String search = request.getParameter("search");
if (choice == null) {
	choice = "";
}
if (search == null) {
	search = "";
}

BbsDao dao = BbsDao.getInstance();

// List<BbsDto> list = dao.getBbsList();
// List<BbsDto> list = dao.getBbsSearchList(choice, search);
List<BbsDto> list = dao.getBbsPagingList(choice, search, pageNumber);

// 글의 총수
int len = dao.getAllBbs(choice, search);
System.out.println("글의 총수:" + len);

// 페이지수
int bbsPage = len / 10;
if (len % 10 > 0) {
	bbsPage = bbsPage + 1;
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbslist.jsp</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	let search = "<%=search%>";
	if(search == "") return;
	
	let obj = document.getElementById("choice");
	obj.value = "<%=choice%>";
	obj.setAttribute("selected", "selected");
});
</script>


</head>

<body bgcolor="#e9e9e9">
	<h4 align="right" style="background-color: #f0f0f0">
		환영합니다
		<%=mem.getId()%>님
	</h4>

	<h2>게시판</h2>

	<div align="center">
		<div id="app" class="container">

			<table
				style="margin-left: auto; margin-right: auto; margin-top: 3px; margin-bottom: 3px">
				<tr>
					<td style="padding-left: 5px"><select class="custom-select"
						id="choice" name="choice">
							<option selected>선택</option>
							<option value="title">제목</option>
							<option value="content">내용</option>
							<option value="writer">작성자</option>
					</select></td>
					<td style="padding-left: 5px" class="align-middle"><input
						type="text" class="form-control" id="search" name="search"
						placeholder="검색어" value="<%=search%>">
					<td style="padding-left: 5px"><span>
							<button type="button" class="btn btn-primary"
								onclick="searchBtn()">검색</button>
					</span></td>
				</tr>
			</table>
			<br>


			<table class="table table-striped table-hover" style="width: 1000px">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
					</tr>
				</thead>

				<tbody>
					<%
					if (list == null || list.size() == 0) {
					%>
					<tr>
						<td colspan="3">작성된 글이 없습니다</td>
					</tr>
					<%
					} else {
					for (int i = 0; i < list.size(); i++) {
						BbsDto bbs = list.get(i);
					%>
					<tr>
						<th><%=i + 1 + pageNumber * 10%></th>
						<td>
							<%
							if (bbs.getDel() == 0) {
							%> <%=arrow(bbs.getDepth())%> <a
							href="bbsdetail.jsp?seq=<%=bbs.getSeq()%>"> <%=bbs.getTitle()%>
						</a> <%
 } else {
 %> <font color="#ff0000">********* 이 글은 작성자에 의해서 삭제되었습니다</font> <%
 }
 %>
						</td>
						<td><%=bbs.getId()%></td>
					</tr>
					<%
					}
					}
					%>
				</tbody>
			</table>

			<br>
			<%
			for (int i = 0; i < bbsPage; i++) { // [1] 2 [3]
				if (pageNumber == i) { // 현재 페이지
			%>
			<span style="font-size: 15pt; color: #0000ff; font-weight: bold;">
				<%=i + 1%>
			</span>
			<%
			} else {
			%>
			<a href="#none" title="<%=i + 1%>페이지" onclick="goPage(<%=i%>)"
				style="font-size: 15pt; color: #000; font-weight: bold; text-decoration: none;">
				[<%=i + 1%>]
			</a>
			<%
			}
			}
			%>


			<br>
			<br> <select id="choice">
				<option value="title">제목</option>
				<option value="content">내용</option>
				<option value="writer">작성자</option>
			</select> <input type="text" id="search" value="<%=search%>">

			<button type="button" onclick="searchBtn()">검색</button>

			<br>
			<br> <a href="bbswrite.jsp">글쓰기</a>
		</div>
	</div>

	<script type="text/javascript">
function searchBtn() {
	let choice = document.getElementById('choice').value;
	let search = document.getElementById('search').value;
	/*
	if(search.trim() == ""){
		alert("검색어를 입력해 주십시오");
		return;
	}
	*/
	
	location.href = "bbslist.jsp?choice=" + choice + "&search=" + search;
}

function goPage( pageNum ) {
	let choice = document.getElementById('choice').value;
	let search = document.getElementById('search').value;
	
	location.href = "bbslist.jsp?choice=" + choice + "&search=" + search + "&pageNumber=" + pageNum;	
}

</script>

</body>
</html>






