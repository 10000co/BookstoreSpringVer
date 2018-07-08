package com.ksh.bookstore.dao;

import java.util.List;

import com.ksh.bookstore.vo.Book;

public interface BookMapper {
	public List<Book> selectBookList();
	public Book selectBookInfo(int bookcode);
	public List<Book> selectBestSeller();
}
