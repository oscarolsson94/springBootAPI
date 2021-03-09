package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {

@RequestMapping("/hello") //by default runs on port 8080, to change go to 
public String hello() { //resources folder and application.properties
	return "Hello World!";
}
	
}
