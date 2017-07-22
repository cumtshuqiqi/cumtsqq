package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;

public interface CartService {
	List<Cart> getAll();
	Cart findCart(int good_id);
	Cart saveCart(int good_id);
	Cart addCart(int good_id);
	Cart reduceCart(int good_id);
	Cart removeCart(int good_id);
	void clearCart();
}
