package com.dshop.service;

import com.dshop.model.Cart;

public interface CartService {
	public Cart getCart();
	public void addProduct(int productId);
	public void subtractProduct(int productId);
	public void removeProduct(int productId);
}
