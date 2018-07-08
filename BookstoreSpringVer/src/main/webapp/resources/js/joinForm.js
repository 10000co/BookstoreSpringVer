function check() {
	var id = document.getElementById('userid').value.trim();
	var pwd = document.getElementById('password').value.trim();
	var username = document.getElementById('username').value.trim();
	
	if(id.length < 3 || id.length > 10) {
		alert('ID와 비밀번호는 3~10자리로 입력해야 합니다.')
		document.getElementById('userid').focus();
		return false;
	}
	
	if(pwd.length < 3 || pwd.length > 10) {
		alert('ID와 비밀번호는 3~10자리로 입력해야 합니다.')
		document.getElementById('password').focus();
		return false;
	}
	
	if(!username) {
		alert('이름은 반드시 입력해야 합니다.');
		document.getElementById('username').focus();
		return false;
	}
	
	return true;
}