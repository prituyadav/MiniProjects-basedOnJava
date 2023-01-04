package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.EventException;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.repos.EventRepo;

import antlr.debug.Event;

@Service
public class EventServiceImpl implements EventServise{
	
	@Autowired 
	private EventRepo er;

	@Override
	public com.masai.models.Event addevent(com.masai.models.Event event) throws EventException {
		return er.save(event);
	}

	@Override
	public String deleteEvent(Integer id) throws EventException {
		
		//Optional<Event> us=er.findById(id);
		er.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public com.masai.models.Event updateEvent(Integer id, com.masai.models.Event ev) throws EventException{
		Optional<Event> us=er.findById(id);
		if(us==null)
			throw new EventException("event doesnt exist");
		
		com.masai.models.Event s=er.save(ev);
		return s;
	}

	@Override
	public List<Event> getAllEvent(String type) throws EventException {
		List<Event> l=er.findAll();
		return l;
	}


}
