package com.dshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dshop.service.CartService;

@Controller
@RequestMapping("cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@GetMapping
	public String cart(Model model) {
		model.addAttribute("cart", cartService.getCart());
		return "public/cart/cart";
	}
	
	@PostMapping("add/{productId}")
	public String addProduct(@PathVariable("productId") int productId) {
		cartService.addProduct(productId);
		return "redirect:/cart";
	}
	
	@PostMapping("subtract/{productId}")
	public String subtractProduct(@PathVariable("productId") int productId) {
		cartService.subtractProduct(productId);
		return "redirect:/cart";
	}
	
	@DeleteMapping("remove/{productId}")
	public String removeProduct(@PathVariable("productId") int productId) {
		cartService.removeProduct(productId);
		return "redirect:/cart";
	}
}
