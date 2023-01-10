   package com.fetch.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetch.exceptions.WrongApiException;
import com.fetch.models.Entry;

import com.fetch.services.MainServices;
import com.fetch.services.MainServicesImpl;


@RestController
@RequestMapping("/myapi")
public class MainController {
	
	@Autowired
	private MainServices services;

	@GetMapping("/welcome")
	public String greetings(){
		return "hello there! a very warm welcome!!!";
	}
	
	@GetMapping("/getStringEntries")
	public String getAllEntryInString(){
		String st=services.getAllEntriesInString();
		return st;
	}
	
//	@GetMapping("/getAllEntries")
//	public Entry[] getAllEntries() throws WrongApiException{
//		Entry[] st=services.getAllEntries();
//		return st;
//	}
	
	@GetMapping("/getAllEntries")
	public List<Entry> getAllEntries() throws WrongApiException{
		List<Entry> st=services.getAllEntries();
		return st;
	}
	
	
	@GetMapping("/getAllEntriesByCategoryInString/{category}")
	public String getAllEntriesBycategoryInString(@PathVariable("category") String Category){
		String st=services.getAllEntriesByCategoryInString(Category);
		return st;
	}
	
	@GetMapping("/getHealth")
	public String getHealthHandler() throws WrongApiException{
		String st=services.getHealth();
		return st;
	}
	
	
	@PostMapping("/saveEntries")
	public String saveEntries(@RequestBody Entry entry) {
		String s=services.saveEntry(entry);
		return s;
	}
	
}
