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
	public Product saveProduct(Product product) { //saves single Product
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) { //saves list of Products
		return repository.saveAll(products);
	}
	
	//get methods
	
	//based on id
	public Product getProductById(int id){ //returns ONE product by primary key id
		return repository.findById(id).orElse(null);
	}
	//based on name
	public Product getProductByName(String name){
		return repository.findByName(name); //custom, we need to create the method in repository
											//can return multiple objects, so maybe change to List return type.
											//name is not a unique key
	}
	
	public List<Product> getProducts(){ //returns all products available in DB
		return repository.findAll();
	}
	
	//delete method
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed! " +id;
	}
	
	//update method
	public Product updateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}
	
}
