package com.ksh.bookstore.dao;

import com.ksh.bookstore.vo.Shopmember;

public interface ShopmemberMapper {
	public int insertShopmember(Shopmember shopmember);
	public Shopmember selectShopmember(Shopmember shopmember);
}
