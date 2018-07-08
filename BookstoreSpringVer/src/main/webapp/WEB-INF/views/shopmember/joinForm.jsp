<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="js/joinForm.js" type="text/javascript"></script>
<link href="css/joinForm.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 회원가입 ]</h2>
	
	<form id="form" action="join" method="post" onsubmit="return check()">
		
		<table border="1">
			<tr>
				<td>ID</td>
				<td>
					<input id="userid" type="text" value="" name="userid"/>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input id="password" type="password" value="" name="password"/>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input id="username" type="text" name="username" />
				</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>
					<input id="address" type="text" name="address" />
				</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>
					<input id="phone" type="text" name="phone" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input id="submit" type="submit" value="가입완료" /> 
				</td>
			</tr>
		</table>
		
	</form>
</body>
</html>