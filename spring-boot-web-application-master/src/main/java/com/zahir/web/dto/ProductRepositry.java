package com.zahir.web.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zahir.web.model.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Long> {

}
