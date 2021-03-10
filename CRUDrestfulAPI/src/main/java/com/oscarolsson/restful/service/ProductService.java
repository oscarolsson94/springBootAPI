package com.oscarolsson.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscarolsson.restful.entity.Product;
import com.oscarolsson.restful.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	//post methods
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	//get methods
	//based on id
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	//based on name
	public Product getProductByName(String name){
		return repository.findByName(name); //custom, we need to create the method in repository
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
}
