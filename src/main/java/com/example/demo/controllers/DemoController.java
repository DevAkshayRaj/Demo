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
	@GetMapping("/test3")
	public String testMethod3() {
		return "Hellow World 2222222222----------3333333333333!";
	}
	@GetMapping("/test4")
	public String testMethod4() {
		return "Full Flow Test using jenkins";
	}
}
