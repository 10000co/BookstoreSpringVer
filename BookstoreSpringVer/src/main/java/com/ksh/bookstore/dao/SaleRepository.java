package com.ksh.bookstore.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksh.bookstore.vo.Sale;

@Repository
public class SaleRepository {

	@Autowired
	SqlSession session;
	
	public int selectOrderOne(Sale sale) {
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		int result = mapper.selectOrderOne(sale);
		
		return result;
	}
	
	public int updateOrderInfo(Sale sale) {
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		int result = mapper.updateOrderInfo(sale);
		
		return result;
	}
	
	public int insertBookSale(Sale sale) {
		SaleMapper mapper = session.getMapper(SaleMapper.class); 
		int result = mapper.insertBookSale(sale);
		
		return result;
	}
	
	public int stockBookMinus(Map<String, Integer> deleteInfo) {
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		int result = mapper.stockBookMinus(deleteInfo);
		
		return result;
	}
	
	public List<Sale> orderSelectAll(String userid) {
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		List<Sale> result = mapper.orderSelectAll(userid);
		
		return result;
	}

	public List<Sale> selectPurchaseMost() {
		SaleMapper mapper = session.getMapper(SaleMapper.class);
		List<Sale> result = mapper.selectPurchaseMost();
		
		return result;
	}
}
