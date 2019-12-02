package com.userregistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping
	public String availableMethods() {
		
		
		return "<ol> <li> add(int,int) <li> multiply(int,int) </ol>";
	}
	
	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a, @PathVariable int b) {
		
		return a + b + "";
	}
}
