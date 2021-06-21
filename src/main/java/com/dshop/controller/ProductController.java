package com.dshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dshop.model.Product;
import com.dshop.responsitory.ProductResponsitory;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	ProductResponsitory productRepo;

	@GetMapping
	public String index(@RequestParam("page") Optional<Integer> page, Model model) {
		int pageIndex;
		if (page.isPresent())
			pageIndex = page.get() - 1;
		else
			pageIndex = 0;
		if (pageIndex < 0)
			return "redirect:/product";

		Pageable pageable = PageRequest.of(pageIndex, 10);
		Page<Product> productPage = productRepo.findAll(pageable);
		model.addAttribute("productPage", productPage);
		return "public/product/list";
	}

}
