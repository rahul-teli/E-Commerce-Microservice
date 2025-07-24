package com.productservice.controllers;

import com.productservice.dtos.ProductDto;
import com.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return null;
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable long id) {
        return null;
    }

    @PostMapping("/products")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return new ProductDto();    
    }
}
