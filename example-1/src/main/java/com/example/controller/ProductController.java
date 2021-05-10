package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) { return service.getProductById(id); }

    @GetMapping("/products")
    public List<Product> getProducts() { return service.getProducts(); }
}
