function bookRead(num) {
	var userid = document.getElementById('userid').value;
	if(userid == "") {
		location.href = "login";
	}
	else {
		location.href = "bookInfo?bookcode=" + num;
	}
}