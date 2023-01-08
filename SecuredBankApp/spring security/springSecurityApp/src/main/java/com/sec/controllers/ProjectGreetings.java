package com.sec.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProjectGreetings {
	
	@GetMapping("/hiii")
	public ResponseEntity<String> sayHi() {
		 String s="hellllllllllooooooo";
		 
		 return new ResponseEntity<String>(s, HttpStatus.OK);
	}
    
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcoming() {
		 String s="Welcome in spring Security..";
		 
		 return new ResponseEntity<String>(s, HttpStatus.OK);
	}
	
}
