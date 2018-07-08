package com.ksh.bookstore.vo;

public class Book {
	int bookcode;
	String title;
	int price;
	int quantity;
	
	public Book() {	}

	public Book(int bookcode, String title, int price, int quantity) {
		super();
		this.bookcode = bookcode;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public int getBookcode() {
		return bookcode;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
