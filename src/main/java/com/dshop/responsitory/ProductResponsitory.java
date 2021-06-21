package com.dshop.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.dshop.model.Product;

public interface ProductResponsitory extends JpaRepository<Product, Integer> {

}
