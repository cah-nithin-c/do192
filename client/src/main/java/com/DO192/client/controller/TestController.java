package com.DO192.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//	@Value("${my.greeting}")
//	private String getGreeting;
	
	@GetMapping("/greeting")
	public String getGreet() {
		return "";
	}
}
