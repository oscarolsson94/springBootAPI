package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@RequestMapping("/courses")	
	public String courses() {
		System.out.println("Welcome to chogge");
		return "courses.jsp"; //add Jasper dependency for java to know how to convert jsp file
	}
	
}
