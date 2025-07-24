package com.productservice.dtos;

import com.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private long id; //TODO: why are we taking as input
    private String title;
    private String description;
    private double price;
    private CategoryDto category;
    private String imageUrl;
}
