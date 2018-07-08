package com.ksh.bookstore.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksh.bookstore.vo.Wishlist;

@Repository
public class WishlistRepository {

	@Autowired
	SqlSession session;
	
	public int selectOne(Wishlist bookcode) {
		WishlistMapper mapper = session.getMapper(WishlistMapper.class);
		int result = mapper.selectOne(bookcode);
		
		return result;
	}
	
	public int insertWishlist(Wishlist wishlistInfo) {
		WishlistMapper mapper = session.getMapper(WishlistMapper.class);
		int result = mapper.insertWishlist(wishlistInfo);
		
		return result;
	}
	
	public List<Wishlist> selectAll(String userid) {
		WishlistMapper mapper = session.getMapper(WishlistMapper.class);
		List<Wishlist> result = mapper.selectAll(userid);
		
		return result;
	}
	
	public int deleteWishlist(Wishlist wishlist) {
		WishlistMapper mapper = session.getMapper(WishlistMapper.class);
		int result = mapper.deleteWishlist(wishlist);
		
		return result;
	}
}
