package com.masai.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.EventException;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.services.EventServise;

import antlr.debug.Event;

@RestController
public class UserEventController {
	
	@Autowired
	private EventServise es;
	
	
	@PostMapping("/saveevent")
   	public ResponseEntity<Event> saveEvent( @RequestBody com.masai.models.Event e) throws EventException {
  		
  		com.masai.models.Event saved=es.addevent(e);
  		
  		
  		return new ResponseEntity<Event>(HttpStatus.CREATED);
  	}
	
	
	

	@PostMapping("/delett")
   	public ResponseEntity<String> deleteEvent( @RequestBody Integer Id ) throws EventException {
  		
  		String saved=es.deleteEvent(Id);
  		
  		
  		return new ResponseEntity<String>(HttpStatus.CREATED);
  	}
	
	
	@PostMapping("/udate")
   	public ResponseEntity<Event> UpdateEvent( @RequestBody com.masai.models.Event e) throws EventException {
  		
  		com.masai.models.Event saved=es.addevent(e);
  		
  		
  		return new ResponseEntity<Event>(HttpStatus.CREATED);
  	}
	
	
	
	@GetMapping("/all")
   	public ResponseEntity<List<Event>> saveEvent( @RequestBody String type) throws EventException {
  		
  		com.masai.models.Event saved=(com.masai.models.Event) es.getAllEvent(type);
  		
  		
  		return new ResponseEntity<List<Event>> (HttpStatus.CREATED);
  	}
	
	
	
}
