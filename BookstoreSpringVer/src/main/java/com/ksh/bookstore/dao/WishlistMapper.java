package com.ksh.bookstore.dao;

import java.util.List;

import com.ksh.bookstore.vo.Wishlist;

public interface WishlistMapper {
	public int selectOne(Wishlist bookcode);
	public int insertWishlist(Wishlist wishlistInfo);
	public List<Wishlist> selectAll(String userid);
	public int deleteWishlist(Wishlist wishlist);

}
