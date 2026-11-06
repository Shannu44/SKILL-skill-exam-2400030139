package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.entity.Product;
import com.klef.soa.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController
{
    @Autowired
    private ProductService service;

    @PostMapping
    public Product insertProduct(@RequestBody Product p)
    {
        return service.insertProduct(p);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product p)
    {
        return service.updateProduct(p);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id)
    {
        service.deleteProduct(id);
    }

    @GetMapping
    public List<Product> displayAllProducts()
    {
        return service.displayAllProducts();
    }

    @GetMapping("/{id}")
    public Product displayProductById(@PathVariable Long id)
    {
        return service.displayProductById(id);
    }

    @GetMapping("/name/{productName}")
    public List<Product> findByProductName(@PathVariable String productName)
    {
        return service.findByProductName(productName);
    }

    @GetMapping("/category/{category}")
    public List<Product> findByCategory(@PathVariable String category)
    {
        return service.findByCategory(category);
    }
}