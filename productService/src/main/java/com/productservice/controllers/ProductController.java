package com.productservice.controllers;

import com.productservice.dtos.ProductDto;
import com.productservice.models.Product;
import com.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired  
    ProductService productService;

    @GetMapping
    public String getAllProducts() {
        // Logic to retrieve all products
        return "List of all products";
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable long productId) {
        return productService.getProductById(productId);
    }

    @PostMapping
    public String addNewProduct(@RequestBody ProductDto productDto) {
        // Logic to add a new product
        return "New product added with details: " ;
    }
    @PutMapping("/{productId}")
    public String updateProduct(String productId, String updatedDetails) {
        // Logic to update an existing product
        return "Product with ID: " + productId + " updated with details: " + updatedDetails;
    }
    @DeleteMapping("/{productId}")
    public String deleteProduct(String productId) {
        // Logic to delete a product
        return "Product with ID: " + productId + " has been deleted";
    }
}
