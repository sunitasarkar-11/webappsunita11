package com.webproj.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")
	
	public String home() {
	//public void home() {
		System.out.println("Hello Servlet ");
		return "home.jsp";
		
	}

}
