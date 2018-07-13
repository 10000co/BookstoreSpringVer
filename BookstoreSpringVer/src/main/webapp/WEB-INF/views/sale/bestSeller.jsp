<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>베스트셀러</title>
<script src="js/bestSeller.js" type="text/javascript"></script>
<link href="css/bestSeller.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 가장 많이 팔린 책 ]</h2>
	
	
	<table border="1">
<%-- 		<c:if test="${not empty book}"> --%>
		<c:if test="${book != null}">
			<c:forEach var="bestSeller" items="${book}">
				<tr>
					<th>상품코드</th>
					<td>${bestSeller.bookcode}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${bestSeller.title}</td>
				</tr>
				<tr>
					<th>가격</th>
					<td>${bestSeller.price}</td>
				</tr>
				<tr>
					<th>총 판매수량</th>
					<td>${bestSeller.quantity}</td>
				</tr>			
			</c:forEach>
		</c:if>
		<c:if test="${book == null}">
			<tr>
				<td>아직 판매된 상품이 없습니다</td>
			</tr>
		</c:if>
		<tr>
			<td align="center" colspan="2">
				<input type="button" value="처음으로" onclick="location.href='${pageContext.request.contextPath}'" />
			</td>
		</tr>
	</table>
	
</body>
</html>