package com.ksh.bookstore.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksh.bookstore.vo.Shopmember;

@Repository
public class ShopmemberRepository {

	@Autowired
	SqlSession session;
	
	public int insertShopmember(Shopmember shopmember) {
		ShopmemberMapper mapper = session.getMapper(ShopmemberMapper.class);
		int result = mapper.insertShopmember(shopmember);
		
		return result;
	}
	
	public Shopmember selectShopmember(Shopmember shopmember) {
		ShopmemberMapper mapper = session.getMapper(ShopmemberMapper.class);
		Shopmember result = mapper.selectShopmember(shopmember);
		
		return result;
	}
}
