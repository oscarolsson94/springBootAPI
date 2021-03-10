package com.oscarolsson.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oscarolsson.restful.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name); //Name of entity and type of Primary key

	
	
}
