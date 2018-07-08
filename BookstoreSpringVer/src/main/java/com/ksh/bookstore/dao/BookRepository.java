package com.ksh.bookstore.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksh.bookstore.vo.Book;

@Repository
public class BookRepository {
	
	@Autowired
	SqlSession session;
	
	public List<Book> selectBookList() {
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> result = mapper.selectBookList();
		
		return result;
	}
	
	public Book selectBookInfo(int bookcode) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book result = mapper.selectBookInfo(bookcode);
		
		return result;
	}

	public List<Book> selectBestSeller() {
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> result = mapper.selectBestSeller();
		
		return result;
	}
}
