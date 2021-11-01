package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/test")
	public String testMethod() {
		return "Hellow World !";
	}
	@GetMapping("/test2")
	public String testMethod2() {
		return "Hellow World 2222222222!";
	}
}
