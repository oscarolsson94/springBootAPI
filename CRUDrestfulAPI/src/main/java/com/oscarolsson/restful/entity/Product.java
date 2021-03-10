package com.oscarolsson.restful.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 			//Creates toString, equals, hashCode, getters and setters methods for our class
@AllArgsConstructor		//Creates constructors
@NoArgsConstructor
@Entity			//Tells that our class can be represented by a table in the database, with each instance representing a row
@Table(name = "PRODUCT_TBL")
public class Product {
	@Id			//This attribute is the primary key in our entity
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	
}
