package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this is meghana
@RestController
@EnableAutoConfiguration
public class Example {
	@RequestMapping("/")
	String Home(){
		return "HELLO";
		
	}

}
