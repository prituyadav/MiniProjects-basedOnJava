package com.masai.services;

import java.util.List;

import com.masai.exceptions.EventException;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.Event;



public interface EventServise {
	 public Event addevent(Event event)throws EventException ;
	    public String deleteEvent(Integer id) throws EventException;
	    
	    public Event updateEvent(Integer id, Event ev) throws EventException;
	    
	    
	    public List<antlr.debug.Event> getAllEvent(String type) throws EventException;
	    
}