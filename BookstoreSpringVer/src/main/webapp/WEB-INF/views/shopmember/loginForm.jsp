<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="js/loginForm.js" type="text/javascript"></script>
<link href="css/loginForm.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 로그인 ]</h2>
	
	<form id="form" action="login" method="post" onsubmit="return check()">
	
		<table border="1">
			<tr>
				<td>ID</td>
				<td>
					<input id="userid" type="text" name="userid" />
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input id="password" type="password" name="password" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input id="submit" type="submit" value="로그인" />
				</td>
			</tr>
		</table>
	</form>
	<table>
		
	</table>
</body>
</html>