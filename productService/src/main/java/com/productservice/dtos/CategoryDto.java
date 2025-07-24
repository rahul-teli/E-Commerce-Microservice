package com.productservice.dtos;

import com.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class CategoryDto {
    private Long id; //TODO: why are we taking as input
    private String name;
    private String description;
    private List<Product> products;
}
