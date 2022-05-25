<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>로그인 폼</title>

<style type="text/css">
@import url("http://fonts.googleapis.com/earlyaccess/nanumgothic.css");

html {
	height: 100%;
}

#aaa{
padding-right:  50px;
}

body {
	width: 100%;
	height: 100%;
	margin: 0;
	padding-top: 80px;
	padding-bottom: 40px;
	font-family: "Inter", sans-serif;
	background-repeat: no-repeat;
	background: linear-gradient(to bottom right, #0098FF, #6BA8D1);
}

a.test123:hover {
	text-decoration: underline;
	color: blue;
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

</head>

<script type="text/javascript">
	let user_id = $.cookie("user_id");
	if (user_id != null) {
		$("#id").val(user_id);
		$("#chk_save_id").prop("checked", true);
	}

	$("#chk_save_id").click(function() {

		if ($("#chk_save_id").is(":checked")) { // 체크되었을 때

			if ($("#id").val().trim() == "") {
				alert("id를 입력해 주십시오");
				$("#chk_save_id").prop("checked", false);
			} else {
				// cookie에 저장	
				$.cookie("user_id", $("#id").val().trim(), {
					expires : 7,
					path : "/"
				});
			}
		} else { // cookie를 삭제
			$.removeCookie("user_id", {
				path : "/"
			});
		}

	});
</script>
<script
	src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.js"
	defer></script>
<script src="particles.js"></script>
	
	
</head>

<body cellpadding="0" cellspacing="0" marginleft="0" margintop="0"
	width="100%" height="100%" align="center">
	 <div class="container">
	<div id="particles-js"></div>
	<div class="card align-middle"
		style="width: 20rem; border-radius: 20px;">
		<div class="card-title" style="margin-top: 30px;">
			<div class="mt-12 flex flex-col items-center">
		
				<h1 class="text-2xl xl:text-3xl font-extrabold">SoeunPage</h1>
			</div>
			<div class="card-body">
				<div class="form-signin">
					<form action="../member?param=loginAf" method="post">

						<!-- 네이버 시작 -->
						<div id="naver_id_login class="bg-whitep-2rounded-full">
							<svg class="w-4" viewBox="0 0 533.5 544.3">
                  </svg>
						</div>
						<span class="ml-4" id="naver_id_login"> Sign Up with Naver
						</span>
						<!-- 네이버 끝 -->

						<div class="my-12 border-b text-center">
							<div
								class="leading-none px-2 inline-block text-sm text-gray-600 tracking-wide font-medium bg-white transform translate-y-1/2">
								Or sign up with e-mail</div>
						</div>
						<input
							style="height:40px"; class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white"
							type="text" name="id" placeholder="아이디" /> <input
							style="height:40px" class="w-full px-8 py-4 rounded-lg font-medium bg-gray-100 border border-gray-200 placeholder-gray-500 text-sm focus:outline-none focus:border-gray-400 focus:bg-white mt-5"
							type="password" name="pwd" placeholder="비밀번호" />

						<!-- ID <input type="text" name="id" class="form-control" placeholder="아이디를 입력하세요" required autofocus><BR> -->
						<!--  PW <input type="password" name="pwd" class="form-control" placeholder="비밀번호를 입력하세요" required>    -->
						<!--  <button id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit">로 그 인</button>-->
						<!-- 로그인 버튼 시작-->
						<button id="btn-Yes" type="submit"
							class="mt-5 tracking-wide font-semibold bg-indigo-500 text-gray-100 w-full py-4 rounded-lg hover:bg-indigo-700 transition-all duration-300 ease-in-out flex items-center justify-center focus:shadow-outline focus:outline-none">
							<svg class="w-6 h-6 -ml-2" fill="none" stroke="currentColor"
								stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                  <path d="M16 21v-2a4 4 0 00-4-4H5a4 4 0 00-4 4v2" />
                  <circle cx="8.5" cy="7" r="4" />
                  <path d="M20 8v6M23 11h-6" />
                </svg>


							<span class="ml-3" onclick="login();"> 로그인 </span>

						</button>
						<!-- 로그인 버튼 끝 -->
						<!--  아이디 기억하기 -->
						<p class="mt-6 text-xs text-gray-600 text-center">
							<input type="text" id="id" name="id" size="20"><input
								type="checkbox" id="chk_save_id">Remember my ID
				</div>


				<!--  아이디 기억하기 끝 -->
				<a id="aaa" href="../member?param=make ">회원가입</a>　　　　　　<a
					href="../member?param=delete">회원탈퇴</a>
				</form>

			</div>
		</div>

	</div>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		let user_id = $.cookie("user_id");
		if (user_id != null) {
			$("#id").val(user_id);
			$("#chk_save_id").prop("checked", true);
		}

		$("#chk_save_id").click(function() {

			if ($("#chk_save_id").is(":checked")) { // 체크되었을 때

				if ($("#id").val().trim() == "") {
					alert("id를 입력해 주십시오");
					$("#chk_save_id").prop("checked", false);
				} else {
					// cookie에 저장	
					$.cookie("user_id", $("#id").val().trim(), {
						expires : 7,
						path : "/"
					});
				}
			} else { // cookie를 삭제
				$.removeCookie("user_id", {
					path : "/"
				});
			}

		});
	</script>
	<script>
	{
		  "particles": {
		    "number": {
		      "value": 80,
		      "density": {
		        "enable": true,
		        "value_area": 800
		      }
		    },
		    "color": {
		      "value": "#ffffff"
		    },
		    "shape": {
		      "type": "circle",
		      "stroke": {
		        "width": 0,
		        "color": "#000000"
		      },
		      "polygon": {
		        "nb_sides": 5
		      },
		      "image": {
		        "src": "img/github.svg",
		        "width": 100,
		        "height": 100
		      }
		    },
		    "opacity": {
		      "value": 0.5,
		      "random": false,
		      "anim": {
		        "enable": false,
		        "speed": 1,
		        "opacity_min": 0.1,
		        "sync": false
		      }
		    },
		    "size": {
		      "value": 10,
		      "random": true,
		      "anim": {
		        "enable": false,
		        "speed": 80,
		        "size_min": 0.1,
		        "sync": false
		      }
		    },
		    "line_linked": {
		      "enable": true,
		      "distance": 300,
		      "color": "#ffffff",
		      "opacity": 0.4,
		      "width": 2
		    },
		    "move": {
		      "enable": true,
		      "speed": 12,
		      "direction": "none",
		      "random": false,
		      "straight": false,
		      "out_mode": "out",
		      "bounce": false,
		      "attract": {
		        "enable": false,
		        "rotateX": 600,
		        "rotateY": 1200
		      }
		    }
		  },
		  "interactivity": {
		    "detect_on": "canvas",
		    "events": {
		      "onhover": {
		        "enable": false,
		        "mode": "repulse"
		      },
		      "onclick": {
		        "enable": true,
		        "mode": "push"
		      },
		      "resize": true
		    },
		    "modes": {
		      "grab": {
		        "distance": 800,
		        "line_linked": {
		          "opacity": 1
		        }
		      },
		      "bubble": {
		        "distance": 800,
		        "size": 80,
		        "duration": 2,
		        "opacity": 0.8,
		        "speed": 3
		      },
		      "repulse": {
		        "distance": 400,
		        "duration": 0.4
		      },
		      "push": {
		        "particles_nb": 4
		      },
		      "remove": {
		        "particles_nb": 2
		      }
		    }
		  },
		  "retina_detect": true
		}

	</script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript">
		var naver_id_login = new naver_id_login("pYhq70ESEm1q8ht_2mEy",
				"http://localhost:8080/assign_soeun/main.html");
		var state = naver_id_login.getUniqState();
		naver_id_login.setButton("b", 20, 40);
		naver_id_login
				.setDomain("http://localhost:8080/assign_soeun/login.html");
		naver_id_login.setState(state);
		naver_id_login.setPopup();
		naver_id_login.init_naver_id_login();
	</script>
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
	</div>
</body>
</html>