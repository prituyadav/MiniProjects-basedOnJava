package com.masai.exceptions;


import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(FirExceptions.class)
	public ResponseEntity<AllErrorDetails> EmployeeExceptionHandler(FirExceptions ee,WebRequest we){
		
		AllErrorDetails myError = new AllErrorDetails();
		
		myError.setLocalTime(LocalDateTime.now());
		myError.setDescription(we.getDescription(false));
		myError.setMassege(ee.getMessage());
		
		return new ResponseEntity<AllErrorDetails>(myError,HttpStatus.BAD_REQUEST);
		
		
		
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<AllErrorDetails> UserExcepitonHandler(UserNotFoundException ex ,WebRequest wr){
		
		AllErrorDetails err = new AllErrorDetails();
		err.setLocalTime(LocalDateTime.now());
		err.setDescription(wr.getDescription(false));
		err.setMassege(ex.getMessage());
		
		return new ResponseEntity<AllErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<AllErrorDetails> exceptionHandler(Exception ex ,WebRequest wr){
		
		AllErrorDetails err = new AllErrorDetails();
		err.setLocalTime(LocalDateTime.now());
		err.setDescription(wr.getDescription(false));
		err.setMassege(ex.getMessage());
		
		return new ResponseEntity<AllErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
}
