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
	@GetMapping("/test5")
	public String testMethod5() {
		return "Full Flow Test using jenkins";
	}
	@GetMapping("/demo")
	public String testMethod6() {
		return "Recent Test";
	}
	@GetMapping("/demo1")
	public String testMethod7() {
		return "Recent Test";
	}
}
