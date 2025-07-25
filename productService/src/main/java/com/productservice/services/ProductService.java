package com.productservice.services;

import com.productservice.dtos.ProductDto;

public interface ProductService {

    public String getAllProducts();


    public String getProductById( long productId) ;


    public String addNewProduct( ProductDto productDto) ;

    public String updateProduct(String productId, String updatedDetails);

    public String deleteProduct(String productId) ;

}
