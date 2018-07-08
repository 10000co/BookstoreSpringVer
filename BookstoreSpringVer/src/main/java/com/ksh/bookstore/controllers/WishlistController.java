package com.ksh.bookstore.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ksh.bookstore.dao.BookRepository;
import com.ksh.bookstore.dao.WishlistRepository;
import com.ksh.bookstore.vo.Book;
import com.ksh.bookstore.vo.Wishlist;

@Controller
public class WishlistController {

	@Autowired
	WishlistRepository repository_wishlist;
	
	@Autowired
	BookRepository repository_book;
	
	@RequestMapping(value="/wishlist", method=RequestMethod.GET)
	public String wishlist(HttpSession session, Model model) {
		String userid = session.getAttribute("loginId").toString();
		
		List<Wishlist> wishlist = repository_wishlist.selectAll(userid);
		
		List<Book> booklist = new ArrayList<>();
		for(Wishlist rs : wishlist) {
			Book bookdata = repository_book.selectBookInfo(rs.getBookcode());
			booklist.add(bookdata);
		}
		
		model.addAttribute("booklist", booklist);
		
		return "wishlist/wishlist";
	}
	
	@RequestMapping(value="/wishlistInfo", method=RequestMethod.GET)
	public String wishlistInfo(int bookcode, HttpSession session, Model model) {
		
		String userid = session.getAttribute("loginId").toString();
				
		Wishlist wishlistInfo = new Wishlist(userid, bookcode);
		
		int chk = repository_wishlist.selectOne(wishlistInfo);
		
		// 중복해서 등록되지 않도록 체크
		if(chk != 0) {
			System.out.println("이미 저장되어있음");
		}
		else {
			repository_wishlist.insertWishlist(wishlistInfo);
		}
		
		return "redirect:wishlist";
	}
	
	@RequestMapping(value="/deleteWishlist", method=RequestMethod.GET)
	public String deleteWishlist(int bookcode, HttpSession session, Model model) {
		String userid = session.getAttribute("loginId").toString();
		
		// 삭제
		Wishlist ls = new Wishlist(userid, bookcode);		
		repository_wishlist.deleteWishlist(ls);
		
		return "redirect:wishlist";
	}
}
