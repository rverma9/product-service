package com.orbit.ecommerce.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private String category;
	
	private Long stockQuantity;
	
	private String imageUrl;
	
	private Boolean active;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
}
