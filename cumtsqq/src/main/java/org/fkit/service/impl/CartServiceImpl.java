package org.fkit.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.fkit.domain.Cart;
import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("CartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper CartMapper;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return CartMapper.findAll();
	}
	
	@Override
	public Cart findCart(int good_id) {
		// TODO Auto-generated method stub
		return CartMapper.findWithId(good_id);
	}

	@Override
	public Cart saveCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setGood_id(good_id);
		final int i = 1;
		cart.setGood_count(i);
		CartMapper.saveCart(cart);
		return cart;
	}
	@Override
	public Cart addCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = CartMapper.findWithId(good_id);
		CartMapper.addCart(cart);
		return cart;
	}

	@Override
	public Cart reduceCart(int good_id) {
		// TODO Auto-generated method stub
		
				Cart cart = CartMapper.findWithId(good_id);
				if (cart.getGood_count() >= 1) {
					CartMapper.reduceCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return cart;
	}

	@Override
	public Cart removeCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = CartMapper.findWithId(good_id);
		CartMapper.removeCart(cart);
		return cart;
	}

	@Override
	public Cart getCart(int good_id,int good_count) {
		// TODO Auto-generated method stub
		Cart cart=new Cart();
		CartMapper.findWithId(good_id);
		cart.setGood_count(good_count);
		cart.setGood_id(good_id);
		CartMapper.get(cart);
		return null;
	}

}

