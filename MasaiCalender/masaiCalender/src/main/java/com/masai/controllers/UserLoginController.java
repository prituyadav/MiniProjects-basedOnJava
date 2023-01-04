package com.masai.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.LoginException;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.models.UserLoginDto;
import com.masai.services.UserLoginSIpml;
import com.masai.services.UserService;
import com.masai.services.UserServiceImpl;
import com.masai.services.UserloginS;

@RestController
public class UserLoginController {
	
	 @Autowired
     private UserloginS uService;
	 
	 @Autowired
     private UserLoginSIpml impl;
      
	@PostMapping("/login")
 	public ResponseEntity<String> RegisterUser( @RequestBody UserLoginDto user) throws UserNotFoundException, LoginException {
  		
  		String savedUser= uService.logIntoAccount(user);
  		
  		
  		return new ResponseEntity<String>(savedUser,HttpStatus.CREATED);
  	}
     
	
	  
		@PostMapping("/login")
	 	public ResponseEntity<String> RegisterUser( @RequestBody Integer id) throws UserNotFoundException, LoginException {
	  		
	  		String savedUser= uService.logOutFromAccount(id);
	  		
	  		
	  		return new ResponseEntity<String>(savedUser,HttpStatus.CREATED);
	  	}
	     
	
}
