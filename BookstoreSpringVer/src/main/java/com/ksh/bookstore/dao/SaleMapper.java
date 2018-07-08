package com.ksh.bookstore.dao;

import java.util.List;
import java.util.Map;

import com.ksh.bookstore.vo.Sale;


public interface SaleMapper {
	public int insertBookSale(Sale sale);
	public int stockBookMinus(Map<String, Integer> deleteInfo);
	public List<Sale> orderSelectAll(String userid);
	public int selectOrderOne(Sale sale);
	public int updateOrderInfo(Sale sale);
	public List<Sale> selectPurchaseMost();
}
