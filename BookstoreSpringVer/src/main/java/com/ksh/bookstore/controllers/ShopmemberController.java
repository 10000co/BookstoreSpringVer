package com.ksh.bookstore.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksh.bookstore.dao.ShopmemberRepository;
import com.ksh.bookstore.vo.Shopmember;

@Controller
public class ShopmemberController {	
	
	@Autowired
	ShopmemberRepository repository;	

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		
		return "shopmember/joinForm";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(Shopmember shopmember, HttpSession session) {
		repository.insertShopmember(shopmember);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		return "shopmember/loginForm";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Shopmember shopmember, Model model, HttpSession session) {
		Shopmember result = repository.selectShopmember(shopmember);
		
		if(result != null) {
			session.setAttribute("loginId", result.getUserid());
			session.setAttribute("userName", result.getUsername());
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
}
