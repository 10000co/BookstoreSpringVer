function checkOrderList() {
	var userid = document.getElementById('userid').value; 
	
	if(userid != "") {
		location.href = "bookList";
	} 
	else {
		location.href = "login";
	}
}

