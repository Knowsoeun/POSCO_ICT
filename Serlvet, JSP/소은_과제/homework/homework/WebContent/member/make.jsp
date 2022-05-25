<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>로그인 폼</title>
<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css"
	rel="stylesheet" />
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"
	charset="utf-8"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;900&display=swap"
	rel="stylesheet" />
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
@import url("http://fonts.googleapis.com/earlyaccess/nanumgothic.css");

html {
	height: 100%;
}

body {
	width: 100%;
	height: 100%;
	margin: 0;
	padding-top: 80px;
	padding-bottom: 40px;
	font-family: "Nanum Gothic", arial, helvetica, sans-serif;
	background-repeat: no-repeat;
	background: linear-gradient(to bottom right, #0098FF, #6BA8D1);
}

.card {
	margin: 0 auto; /* Added */
	float: none; /* Added */
	margin-bottom: 10px; /* Added */
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.make {
	margin-top: 50px;
	margin-left: 200px;
}
</style>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	function execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
						// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
						// 각 주소의 노출 규칙에 따라 주소를 조합한다.
						// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
						var fullAddr = ''; // 최종 주소 변수
						var extraAddr = ''; // 조합형 주소 변수
						if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
							fullAddr = data.roadAddress;
						} else { // 사용자가 지번 주소를 선택했을 경우(J)
							fullAddr = data.jibunAddress;
						}
						// 사용자가 선택한 주소가 도로명 타입일때 조합한다.
						if (data.userSelectedType === 'R') {
							//법정동명이 있을 경우 추가한다.
							if (data.bname !== '') {
								extraAddr += data.bname;
							}
							// 건물명이 있을 경우 추가한다.
							if (data.buildingName !== '') {
								extraAddr += (extraAddr !== '' ? ', '
										+ data.buildingName : data.buildingName);
							}
							// 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.

							fullAddr += (extraAddr !== '' ? ' (' + extraAddr
									+ ')' : '');
						}
						// 우편번호와 주소 정보를 해당 필드에 넣는다.
						document.getElementById('postcode').value = data.zonecode; //5자리 새우편번호 사용
						document.getElementById('address').value = fullAddr;
						document.getElementById('address').focus();
					}
				}).open();
	}
</script>


</head>

<body cellpadding="0" cellspacing="0" marginleft="0" margintop="0"
	width="100%" height="100%" align="center">

	<div class="card align-middle"
		style="width: 20rem; border-radius: 20px;">
		<div class="card-title" style="margin-top: 30px;">
			<div class="mt-12 flex flex-col items-center">
				<h1 class="text-2xl xl:text-3xl font-extrabold">회원가입</h1>
			</div>
		</div>
		<div class="card-body">
			<div class="form-signin">
				<form action="../member?param=makeAf" method="post">
					<!-- ID <input type="text" name="id" class="form-control" placeholder="아이디를 입력하세요" ><br> -->
					<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" name="id" placeholder="아이디를 입력하세요" /><br>
					<br>
					<!-- PWD <input type="password" name="pwd" class="form-control" placeholder="비밀번호를 입력하세요" ><br>
	        Name <input type="text" name="name" class="form-control" placeholder="이름을 입력하세요" ><br>
	        Age <input type="text" name="age" class="form-control" placeholder="나이을 입력하세요" ><br>
	        Birth <input type="text" name="birth" class="form-control" placeholder="생일을 입력하세요" ><br>
	        <input type="button" value="주소찾기" onclick = "sample6_execDaumPostcode()"></button><br><br>
	        우편번호 <input type="text" id="sample6_postcode"   readonly/> 
	        address <input type="text" name="email" class="form-control" id="sample6_address" placeholder="주소를 입력하세요" ><br>
	        Height <input type="text" name="height" class="form-control" placeholder="키를 입력하세요" ><br>-->
					<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="password" name="pwd" placeholder="비밀번호를 입력하세요" /><br>
					<br> <input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" name="name" placeholder="이름을 입력하세요" /><br>
					<br>
					<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" name="age" placeholder="나이를 입력하세요" /><br>
					<br>
					<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" name="birth" placeholder="생일을 입력하세요" /><br>
					<br>
					<input type="button" value="주소찾기"  class="btn btn-secondary" onclick = "execDaumPostcode()"></button><br>
	        우편번호 <input type="text" id="postcode"   readonly/> 
<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" id="address" name="address" placeholder="주소를 입력하세요" /><br>
					<br>
					<input style="height: 40px"
						; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
						type="text" name="height" placeholder="키를 입력하세요" /><br>
					<br>
					



					<button id="btn-Yes" type="submit"
						class="mt-5 tracking-wide font-semibold bg-indigo-500 text-gray-100 w-full py-4 rounded-lg hover:bg-indigo-700 transition-all duration-300 ease-in-out flex items-center justify-center focus:shadow-outline focus:outline-none">
						<svg class="w-6 h-6 -ml-2" fill="none" stroke="currentColor"
							stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                  <path d="M16 21v-2a4 4 0 00-4-4H5a4 4 0 00-4 4v2" />
                  <circle cx="8.5" cy="7" r="4" />
                  <path d="M20 8v6M23 11h-6" />
                </svg>
						<span class="ml-3" onclick="login();"> 회원가입 </span>
					</button>

				</form>
			</div>

		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
<style>
body{
margin: 0;
    max-width:100%;
    max-height:100%;
    background-repeat: no-repeat;
    background-size: cover;
    background-image : url("../image/back.jpg");
    background-position: center;
}
</style>
</body>
</html>