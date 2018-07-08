function buy() {
		var stock = parseInt(document.getElementById('stockQuantity').innerHTML);
		var purchasecnt = parseInt(document.getElementById('purchasecnt').value.trim());
		
		if(stock < purchasecnt) {
			alert('재고수량이 충분하지 않습니다.');
			document.getElementById('purchasecnt').focus();
			return false;
		}
		
		if(purchasecnt == 0 || !purchasecnt) {
			alert('구매수량을 입력해주세요.');
			document.getElementById('purchasecnt').focus();
			return false;
		}
		
		return true;
}

function save() {
	var bookcode = document.getElementById('bookcode').innerHTML;
	location.href = "wishlistInfo?bookcode=" + bookcode;
}

