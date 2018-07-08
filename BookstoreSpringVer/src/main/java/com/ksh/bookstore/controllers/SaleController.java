package com.ksh.bookstore.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ksh.bookstore.dao.SaleRepository;
import com.ksh.bookstore.vo.Sale;

@Controller
public class SaleController {

	@Autowired
	SaleRepository repository;
	
	@RequestMapping(value="/sale", method=RequestMethod.GET)
	public String sale(Model model, HttpSession session) {
		// 리스트 출력
		List<Sale> saleList = repository.orderSelectAll(session.getAttribute("loginId").toString());
		
		model.addAttribute("sale", saleList);
		
		return "sale/orderInfo";
	}
	
	@RequestMapping(value="/sale", method=RequestMethod.POST)
	public String sale(Sale sale, Model model, HttpSession session) {
		
		int chk = repository.selectOrderOne(sale);
		
		if(chk > 0) {
			// 구매량만 증가
			repository.updateOrderInfo(sale);
		}
		else {
			// 새로운 구매정보 추가
			repository.insertBookSale(sale);
		}
		
		Map<String,Integer> deleteInfo = new HashMap<>();
		
		// 재고량 감소
		deleteInfo.put("quantity", sale.getPurchasecnt());
		deleteInfo.put("bookcode", sale.getBookcode());
		
		repository.stockBookMinus(deleteInfo);
		
		return "redirect:sale";
	}
	
}
