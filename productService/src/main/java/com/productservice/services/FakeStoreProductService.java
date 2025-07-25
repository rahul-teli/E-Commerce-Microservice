package com.productservice.services;

import com.productservice.dtos.ProductDto;
import org.springframework.stereotype.Service;


@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public String getAllProducts() {
        return "";
    }

    @Override
    public String getProductById(long productId) {
        return "";
    }

    @Override
    public String addNewProduct(ProductDto productDto) {
        return "";
    }

    @Override
    public String updateProduct(String productId, String updatedDetails) {
        return "";
    }

    @Override
    public String deleteProduct(String productId) {
        return "";
    }
}
