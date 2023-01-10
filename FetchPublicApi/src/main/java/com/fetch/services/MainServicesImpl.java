package com.fetch.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fetch.exceptions.WrongApiException;
import com.fetch.models.AllEntries;
import com.fetch.models.Entry;

import lombok.Value;

@Service
public class MainServicesImpl implements MainServices{
	
     @org.springframework.beans.factory.annotation.Value("${external.api.url}")
     private String baseUrl;
	
	@Autowired
	private RestTemplate restT;
	

	@Override
	public String getAllEntriesInString() {
		String entries=restT.getForObject(baseUrl+"/entries", String.class);
		return entries;
	}

//	@Override
//	public void getEn() {
//		// TODO Auto-generated method stub
//		String entries=restT.getForObject("https://api.publicapis.org/entries", String.class);
//		//return entries;
//		System.out.println(entries);
//	}
//
//	@Override
//	public Entry[] getAllEntriesByCategory( String Category) {
//		// TODO Auto-generated method stub
//		Entry[] entries=restT.getForObject(baseUrl+"entries?category="+Category, Entry[].class);
//		return entries;
//	}

	
	@Override
	public String getAllEntriesByCategoryInString( String Category) {
		// TODO Auto-generated method stub
		String entries=restT.getForObject(baseUrl+"entries?category="+Category, String.class);
		return entries;
	}

//	@Override
//	public Entry[] getAllEntries() {
//		AllEntries allE=restT.getForObject(baseUrl+"/entries", AllEntries.class);
//		
//		Entry[] en=allE.getAllEntries();
//		
//		return en;
//	}
	
	@Override
	public List<Entry> getAllEntries() {
		AllEntries allE=restT.getForObject(baseUrl+"/entries", AllEntries.class);
		
		List<Entry> en=allE.getAllEntries();
		
		return en;
	}
	

	@Override
	public String getHealth() throws WrongApiException {
		String h=restT.getForObject(baseUrl+"/health", String.class);
		return h;
	}

	@Override
	public String saveEntry(Entry entry) {
		AllEntries allE=restT.getForObject(baseUrl+"/entries", AllEntries.class);
		List<Entry> en=allE.getAllEntries();
		en.add(entry);
	    
		Long c=allE.getCount()+1;
		
		AllEntries a=new AllEntries(c,en);
		
		HttpHeaders h=new HttpHeaders();
		h.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<AllEntries> he=new HttpEntity<>(a,h);
		
		ResponseEntity<AllEntries> responseEntity =restT.postForEntity(baseUrl+"/entries", he, AllEntries.class);
		
		if(responseEntity.getStatusCode()==HttpStatus.CREATED)		
	      return "entry saved successfully..";
		else
			return "entry not saved";
		
	}

	
	
	
	
	
	
	
}
