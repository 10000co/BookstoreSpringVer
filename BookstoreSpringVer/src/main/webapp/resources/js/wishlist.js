function del(bookcode) {
	var check = confirm('삭제하시겠습니까?');
	if(check) {			
		location.href = "deleteWishlist?bookcode=" + bookcode;
	}
}