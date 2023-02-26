package com.masai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;

import com.masai.services.UserServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserServices us;
	
	@PostMapping("/register")
	ResponseEntity<User>  registerUserHandler(@RequestBody User user) throws UserNotFoundException{
		User userr=us.registerUser(user);
		return new ResponseEntity<>(userr, HttpStatus.CREATED);
	}

}
