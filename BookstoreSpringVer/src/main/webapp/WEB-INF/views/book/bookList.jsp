<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품목록</title>
<script src="js/bookList.js" type="text/javascript"></script>
<link href="css/bookList.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 상품 목록 ]</h2>
	
	<input id="userid" type="hidden" value="${sessionScope.loginId}" />
	
	<table border="1">
		<tr>
			<th>상품코드</th>
			<th>제목</th>
		</tr>
		<c:if test="${not empty bookList}">
			<c:forEach var="book" items="${bookList}">				
				<tr>
					<td>${book.bookcode}</td>
					<td id="content">
						<a href="javascript:bookRead(${book.bookcode})">${book.title}</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty bookList}">
			<tr>
				<th>상품코드</th>
				<th>제목</th>
			</tr>
			<tr>
				<td colspan="2">등록된 상품이 없습니다.</td>
			</tr>
		</c:if>
		<tr>
			<td colspan="2">
				<input type="button" value="처음으로" onclick="location.href='${pageContext.request.contextPath}'" />	
			</td>
		</tr>
	</table>
	
	
	
	
	
	
</body>
</html>