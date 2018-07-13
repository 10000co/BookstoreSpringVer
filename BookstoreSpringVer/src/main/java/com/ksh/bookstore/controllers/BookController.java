package com.ksh.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksh.bookstore.dao.BookRepository;
import com.ksh.bookstore.dao.SaleRepository;
import com.ksh.bookstore.vo.Book;
import com.ksh.bookstore.vo.Sale;

@Controller
public class BookController {
	
	@Autowired
	BookRepository repository_book;
	
	@Autowired
	SaleRepository repository_sale;
	
	@RequestMapping(value="/bookList", method=RequestMethod.GET)
	public String bookList(Model model) {
		List<Book> bookList = repository_book.selectBookList();
		
		model.addAttribute("bookList", bookList);
		
		return "book/bookList";
	}
	
	@RequestMapping(value="/bookInfo", method=RequestMethod.GET)
	public String bookInfo(int bookcode, Model model) {
		Book bookInfo = repository_book.selectBookInfo(bookcode);
		
		model.addAttribute("bookInfo", bookInfo);
		
		return "book/bookInfo";
	}
	
	@RequestMapping(value="/bestSeller", method=RequestMethod.GET)
	public String bestSeller(Model model) {
		List<Book> book = repository_book.selectBestSeller();
		List<Sale> most = repository_sale.selectPurchaseMost();
		
		if(most.size() > 0) {
			for(int i=0; i<book.size(); i++) {
				switch(book.get(i).getBookcode()) {
					case 1 : 
						book.get(i).setTitle("Java 1.9 따라하기");
						book.get(i).setPrice(10000);					
						book.get(i).setQuantity(most.get(0).getPurchasecnt());
						break;
					case 2 :
						book.get(i).setTitle("C로 배우는 자료구조");
						book.get(i).setPrice(12000);
						book.get(i).setQuantity(most.get(0).getPurchasecnt());
						break;
					case 3 :
						book.get(i).setTitle("HTML5_CSS");
						book.get(i).setPrice(9000);
						book.get(i).setQuantity(most.get(0).getPurchasecnt());
						break;
					case 4 :
						book.get(i).setTitle("자바 디자인 패턴");
						book.get(i).setPrice(15000);
						book.get(i).setQuantity(most.get(0).getPurchasecnt());
						break;
					case 5 :
						book.get(i).setTitle("안드로이드 프로그래밍");
						book.get(i).setPrice(20000);
						book.get(i).setQuantity(most.get(0).getPurchasecnt());
						break;
				}
			}
		
			model.addAttribute("book", book);
		}
		else {
			model.addAttribute("book", null);
		}
		
		return "sale/bestSeller";
	}
}
