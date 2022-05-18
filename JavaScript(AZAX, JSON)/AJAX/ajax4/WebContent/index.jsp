<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<p id="demo"></p>
<br>
<button type="button">클릭</button>

<script type="text/javascript">
$(document).ready(function(){
	
	$("button").click(function(){
		
		$.ajax({
			url:"./hello",
			type:"get",
		//	data:"id=abc&pw=123",
			data:{ id:"abc", pw:"123" },
			datatype:"json",
			success:function( data ){
				// alert('success');
				// alert(data);
				// alert( JSON.stringify(data) );
				
				// $("#demo").text( data.str );
				
				// alert( JSON.stringify(data) );
				
				// $("#demo").text( data.mydatas.title + " " + data.mydatas.content );
				
				alert( JSON.stringify(data.list[0]) );
			},
			error:function(){
				alert('error');
			}			
		})
		
	})
});


</script>

</body>
</html>






