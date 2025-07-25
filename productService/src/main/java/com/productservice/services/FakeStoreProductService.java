package com.productservice.services;

import com.productservice.dtos.ProductDto;
import com.productservice.models.Category;
import com.productservice.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class FakeStoreProductService implements ProductService{

    RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }


    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(long productId) {

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<ProductDto> response = restTemplate.
                getForEntity("https://fakestoreapi.com/products/{id}",
                        ProductDto.class, productId);

        ProductDto productDto = response.getBody();

        Product product = new Product();
        product.setId(productDto.getId());
        product.setImageUrl(productDto.getImage());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setTitle(productDto.getTitle());
        Category category = new Category();
        category.setName(productDto.getCategory());
        product.setCategory(category);

        return product;
    }

    @Override
    public Product addNewProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return true;
    }
}
