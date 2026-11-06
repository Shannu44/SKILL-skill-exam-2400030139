package com.klef.soa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    List<Product> findByProductName(String productName);

    List<Product> findByCategory(String category);
}