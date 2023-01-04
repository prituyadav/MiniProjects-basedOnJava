package com.masai.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.debug.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{

	com.masai.models.Event save(com.masai.models.Event event);

}
