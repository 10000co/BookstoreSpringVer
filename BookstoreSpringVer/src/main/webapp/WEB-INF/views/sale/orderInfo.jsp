<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문정보</title>
<script src="js/orderInfo.js" type="text/javascript"></script>
<link href="css/orderInfo.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ ${sessionScope.userName}(${sessionScope.loginId}) 님의 구매목록 ]</h2>
	
	<table border="1">
		<tr>
			<th>구입일</th>
			<th>상품코드</th>
			<th>제목</th>
			<th>가격</th>
			<th>수량</th>
			<th>합계금액</th>
		</tr>
			<c:forEach var="order" items="${sale}">
				<tr>
					<td>${order.purchasedate}</td>
					<td>${order.bookcode}</td>
					<td>${order.title}</td>
					<td>${order.price}</td>
					<td>${order.purchasecnt}</td>
					<td>${order.total}</td>
				</tr>
				
				<c:set var="sum" value="${sum + order.total}"/>			
			</c:forEach>		
		<tr>
			<td colspan="5">누적 구매액</td>
			<td>${sum}</td>
		</tr>
		<tr>
			<td align="center" colspan="6">
				<input type="button" value="처음으로" onclick="location.href='${pageContext.request.contextPath}'" />		
			</td>
		</tr>
	</table>
	
	
</body>
</html>