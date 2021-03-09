package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@RequestMapping("/courses")	
	
//	@ResponseBody add ResponseBody if you want to just return statement and not file
	public String courses() {
		return "courses.jsp"; //add Jasper dependency for java to know how to convert jsp file
	}
	
}
