<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<script src="js/index.js" type="text/javascript"></script>
<link href="css/index.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 온라인 서점 ]</h2>
	
	<input id="userid" type="hidden" value="${sessionScope.loginId}" />	
	
	<c:if test="${sessionScope.loginId == null}">		
		<ul>
			<li>
				<a href="join">회원가입</a>
			</li>
			<li>
				<a href="login">로그인</a>
			</li>
			<li>
				<a href="javascript:checkOrderList()">상품목록</a>
			</li>
			<li>
				<a href="bestSeller">베스트셀러</a>
			</li>
		</ul>	
	</c:if>
	
	<c:if test="${sessionScope.loginId != null}">
		<ul>
			<li>
				<h2>${sessionScope.userName}님(${sessionScope.loginId}) 로그인 되셨습니다.</h2>
			</li>
			<li>
				<a href="logout">로그아웃</a>
			</li>
			<li>
				<a href="sale">주문정보</a>
			</li>
			<li>
				<a href="wishlist">관심상품</a>
			</li>
			<li>
				<a href="javascript:checkOrderList()">상품목록</a>
			</li>
			<li>
				<a href="bestSeller">베스트셀러</a>
			</li>
		</ul>
	</c:if>
	
</body>
</html>