package com.oscarolsson.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oscarolsson.restful.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{ //Name of entity and type of Primary key

	Product findByName(String name); 

	
	
}
