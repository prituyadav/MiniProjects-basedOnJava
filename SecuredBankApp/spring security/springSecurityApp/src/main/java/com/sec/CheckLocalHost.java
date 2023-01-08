package com.sec;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckLocalHost {
	
	@GetMapping("/")
	public String check() {
		return "welcome in spring Security";
	}
	
	@PostMapping("/sec")
	ResponseEntity<String> adding(){
		return new ResponseEntity("commmmmmmmmmmmmmmmmm",HttpStatus.OK);
	}
	
	

}
