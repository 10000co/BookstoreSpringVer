package com.ksh.bookstore.vo;

public class Shopmember {
	String userid;
	String password;
	String username;
	String address;
	String phone;
	
	public Shopmember() { }

	public Shopmember(String userid, String password, String username, String address, String phone) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.address = address;
		this.phone = phone;
	}

	public String getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Shopmember [userid=" + userid + ", password=" + password + ", username=" + username + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
}
