package com.bank.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
   
	@GetMapping("/")
	public String check() {
		return "welcome dude..";
	}
	
	
	
}
