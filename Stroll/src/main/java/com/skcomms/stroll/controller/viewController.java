package com.skcomms.stroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "greet";
	}
	
}
