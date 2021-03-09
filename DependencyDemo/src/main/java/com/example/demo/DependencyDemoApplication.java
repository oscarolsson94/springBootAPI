package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);
		Customers c = context.getBean(Customers.class); // tell compiler to return a Spring object on Customers class
		c.display(); // we need to add @component in Customers class for spring to know there is a bean
	}

}
