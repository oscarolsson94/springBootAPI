package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@RequestMapping("/courses")	
	
//	@ResponseBody add ResponseBody if you want to just return statement and not file
	public String courses(HttpServletRequest req) { //grab what is in web params
		
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		
		session.setAttribute("name", name); //now we can use it in .jsp file with ${name}
		
		return "courses.jsp"; //add Jasper dependency for java to know how to convert jsp file
	}
	
}
