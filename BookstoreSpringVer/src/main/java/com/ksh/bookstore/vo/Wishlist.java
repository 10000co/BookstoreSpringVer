package com.ksh.bookstore.vo;

public class Wishlist {
	String userid;
	int bookcode;
	
	public Wishlist() {	}

	public Wishlist(String userid, int bookcode) {
		super();
		this.userid = userid;
		this.bookcode = bookcode;
	}

	public String getUserid() {
		return userid;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	@Override
	public String toString() {
		return "Wishlist [userid=" + userid + ", bookcode=" + bookcode + "]";
	}
	
	
}
