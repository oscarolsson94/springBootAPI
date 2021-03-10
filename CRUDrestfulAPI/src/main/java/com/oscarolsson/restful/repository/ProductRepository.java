package com.oscarolsson.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscarolsson.restful.entity.Product;


@Repository			//indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public interface ProductRepository extends JpaRepository<Product, Integer>{ //Name of entity and type of Primary key

	Product findByName(String name); 

	
	
}
