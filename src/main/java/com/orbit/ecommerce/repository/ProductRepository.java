package com.orbit.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orbit.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
