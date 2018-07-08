<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심상품목록</title>
<script src="js/wishlist.js" type="text/javascript"></script>
<link href="css/wishlist.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ ${sessionScope.userName}(${sessionScope.loginId}) 님의 WishList ]</h2>
	<table border="1">
		<tr>
			<th>상품코드</th>
			<th>제목</th>
			<th>가격</th>
			<th>관심상품 삭제하기</th>
		</tr>
		<c:if test="${not empty booklist}">
			<c:forEach var="wishlist" items="${booklist}" >
				<tr>
					<td>${wishlist.bookcode}</td>
					<td>${wishlist.title}</td>
					<td>${wishlist.price}</td>
					<td align="center">
						<input type="button" value="삭제" onclick="javascript:del(${wishlist.bookcode})" />
					</td>
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty booklist}">
			<tr>
				<td align="center" colspan="4">등록된 내용이 없습니다.</td>
			</tr>
		</c:if>
		<tr>
			<td align="center" colspan="4">
				<input type="button" value="처음으로" onclick="location.href='${pageContext.request.contextPath}'" />
			</td>
		</tr>		
	</table>
</body>
</html>