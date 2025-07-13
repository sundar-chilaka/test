package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/test")
public class controller {
	
	@GetMapping
	public String message() {
		return "hello this is my fist depply in aws!...........";
	}

}
