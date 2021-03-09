package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {

	@RequestMapping("/courses")	
	

	public ModelAndView courses(@RequestParam("name") String name) { //grab what is in web params after ?
	
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("myname");
		
		return mv; 
	}
	
}