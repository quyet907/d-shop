package com.dshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dshop.model.Cart;
import com.dshop.model.Product;
import com.dshop.responsitory.ProductResponsitory;


@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private Cart cart;
	
	@Autowired
	ProductResponsitory productResponsitory;
	
	@Override
	public Cart getCart() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Override
	public void addProduct(int productId) {
		Product product = productResponsitory.findById(productId).get();
		if (cart.getCart().containsKey(product)) {
			int count = cart.getCart().get(product);
			cart.getCart().replace(product, count + 1);
		} else {
			cart.getCart().put(product, 1);
		}
	}

	@Override
	public void subtractProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productResponsitory.findById(productId).get();
		if (cart.getCart().containsKey(product)) {
			int count = cart.getCart().get(product);
			cart.getCart().replace(product, count - 1);
		}
	}

	@Override
	public void removeProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productResponsitory.findById(productId).get();
		if (cart.getCart().containsKey(product)) {
			cart.getCart().remove(product);
		}
	}

}
