package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Product;

public interface ProductService
{
    Product insertProduct(Product p);

    Product updateProduct(Product p);

    void deleteProduct(Long productId);

    List<Product> displayAllProducts();

    Product displayProductById(Long productId);

    List<Product> findByProductName(String productName);

    List<Product> findByCategory(String category);
}