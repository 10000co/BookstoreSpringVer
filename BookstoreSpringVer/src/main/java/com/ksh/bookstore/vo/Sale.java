package com.ksh.bookstore.vo;

public class Sale {
	String userid;
	int bookcode;
	int purchasecnt;
	String purchasedate;
	String title;
	int price;
	int total;

	public Sale() {	}

	public Sale(String userid, int bookcode, int purchasecnt, String purchasedate, String title, int price, int total) {
		super();
		this.userid = userid;
		this.bookcode = bookcode;
		this.purchasecnt = purchasecnt;
		this.purchasedate = purchasedate;
		this.title = title;
		this.price = price;
		this.total = total;
	}

	public String getUserid() {
		return userid;
	}

	public int getBookcode() {
		return bookcode;
	}

	public int getPurchasecnt() {
		return purchasecnt;
	}

	public String getPurchasedate() {
		return purchasedate;
	}
	
	public int getTotal() {
		return total;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public void setPurchasecnt(int purchasecnt) {
		this.purchasecnt = purchasecnt;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sale [userid=" + userid + ", bookcode=" + bookcode + ", purchasecnt=" + purchasecnt + ", purchasedate="
				+ purchasedate + ", title=" + title + ", price=" + price + ", total=" + total + "]";
	}
	
	
	
}
