package com.email.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.models.Emailclass;
import com.email.services.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private Emailclass email;
	

	@Autowired
	private EmailService es;
     
	@RequestMapping("/check")
	public String mail() {
		return "welcomm";
	}
	
	
	@PostMapping("/sendmail")
	public ResponseEntity<String> sending(@RequestBody Emailclass mail){
		String s=es.sendMail(mail);
		
		return new ResponseEntity<>(s, HttpStatus.OK);
		
	}
}
