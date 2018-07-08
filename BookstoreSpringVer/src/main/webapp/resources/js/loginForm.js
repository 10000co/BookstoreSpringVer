function check() {
	var id = document.getElementById('userid').value;
	var pwd = document.getElementById('password').value;
	
	if(!id) {
		alert('아이디를 입력하세요.');
		document.getElementById('userid').focus();
		return false;
	}
	
	if(!pwd) {
		alert('비밀번호를 입력하세요')
		document.getElementById('password').focus();
		return false;
	}
	
	return true;
}