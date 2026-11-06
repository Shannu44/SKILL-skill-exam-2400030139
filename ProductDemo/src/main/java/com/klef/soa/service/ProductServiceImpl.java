package com.klef.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Product;
import com.klef.soa.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository repository;

    @Override
    public Product insertProduct(Product p)
    {
        return repository.save(p);
    }

    @Override
    public Product updateProduct(Product p)
    {
        return repository.save(p);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        repository.deleteById(productId);
    }

    @Override
    public List<Product> displayAllProducts()
    {
        return repository.findAll();
    }

    @Override
    public Product displayProductById(Long productId)
    {
        return repository.findById(productId).orElse(null);
    }

    @Override
    public List<Product> findByProductName(String productName)
    {
        return repository.findByProductName(productName);
    }

    @Override
    public List<Product> findByCategory(String category)
    {
        return repository.findByCategory(category);
    }
}