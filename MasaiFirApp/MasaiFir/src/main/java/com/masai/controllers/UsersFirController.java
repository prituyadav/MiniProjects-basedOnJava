package com.masai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.FirExceptions;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.Fir;
import com.masai.models.User;
import com.masai.services.FirService;
import com.masai.services.UserServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/user")
public class UsersFirController {
    
	@Autowired
	private FirService firs;
	
	
	@PostMapping("/fir")
	ResponseEntity<Fir>  addFirByUserHandler(@RequestBody Fir fi) throws FirExceptions{
		Fir fir=firs.addFir(fi);
		return new ResponseEntity<>(fir, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/fir")
	ResponseEntity<Fir>  addFirByUserHandler(@RequestBody Fir fi) throws FirExceptions{
		Fir fir=firs.addFir(fi);
		return new ResponseEntity<>(fir, HttpStatus.CREATED);
	}
	@PostMapping("/fir")
	ResponseEntity<Fir>  addFirByUserHandler(@RequestBody Fir fi) throws FirExceptions{
		Fir fir=firs.addFir(fi);
		return new ResponseEntity<>(fir, HttpStatus.CREATED);
	}
	@PostMapping("/fir")
	ResponseEntity<Fir>  addFirByUserHandler(@RequestBody Fir fi) throws FirExceptions{
		Fir fir=firs.addFir(fi);
		return new ResponseEntity<>(fir, HttpStatus.CREATED);
	}
}
