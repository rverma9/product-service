package com.orbit.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
	
	private String name;
	private String description;
	private double price;
	private String category;
	private Long stockQuantity;
	private String imageUrl;
	private Boolean active;

}
