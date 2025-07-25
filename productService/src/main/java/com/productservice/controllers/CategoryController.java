package com.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public String getAllCategories() {
        // Logic to retrieve all categories
        return "List of all categories";
    }

    @GetMapping("/products/categories/{categoryId}")
    public String allProductsInCategory(String categoryId) {
        // Logic to retrieve all products in a specific category
        return "List of products in category ID: " + categoryId;
    }
}
