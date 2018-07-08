<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<script src="js/bookInfo.js" type="text/javascript"></script>
<link href="css/bookInfo.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<h2>[ 상품 상세 정보 ]</h2>
	<form id="form" action="sale" method="post" onsubmit="return buy()">
		<input type="hidden" name="userid" value="${sessionScope.loginId}"/>
		<input type="hidden" name="bookcode" value="${bookInfo.bookcode}"/>			
	
		<table border="1">
			<tr>
				<th>상품코드</th>
				<td id="bookcode">${bookInfo.bookcode}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td id="title">${bookInfo.title}</td>
			</tr>
			<tr>
				<th>가격</th>
				<td id="price">${bookInfo.price}</td>
			</tr>
			<tr>
				<th>재고수량</th>
				<td id="stockQuantity">${bookInfo.quantity}</td>
			</tr>
			<tr>
				<th colspan="2">
					구매수량
					<input id="purchasecnt" name="purchasecnt" type="text" />
					<input id="submit" type="submit" value="구입하기" />
					<input type="button" value="관심상품저장" onclick="javascript:save()" />
					<input type="button" value="리스트로 이동" onclick="location.href='${pageContext.request.contextPath}/bookList'" />
				</th>							
			</tr>
		</table>
	</form>
</body>
</html>