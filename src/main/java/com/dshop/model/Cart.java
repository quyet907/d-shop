package com.dshop.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Cart {
	private Map<Product, Integer> cart = new HashMap<Product, Integer>();

	public Map<Product, Integer> getCart() {
		return cart;
	}

	public void updateCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

}
