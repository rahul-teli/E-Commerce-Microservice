package com.productservice.controllers;

import com.productservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getAllProducts() {
        // Logic to retrieve all products
        return "List of all products";
    }

    @GetMapping("/{productId}")
    public String getProductById(@PathVariable long productId) {
        // Logic to retrieve a product by its ID
        return "Product details for ID: " + productId;
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
