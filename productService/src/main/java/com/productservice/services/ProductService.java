package com.productservice.services;

import com.productservice.dtos.ProductDto;
import com.productservice.models.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();


    public Product getProductById( long productId) ;


    public Product addNewProduct( Product product) ;

    public Product updateProduct(Long productId, Product product) ;

    public boolean deleteProduct(Long productId) ;

}
