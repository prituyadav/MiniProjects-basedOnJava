package com.fetch.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fetch.exceptions.WrongApiException;
import com.fetch.models.Entry;


public interface MainServices {
	//public void getEn();
	
	public String getAllEntriesInString();
	
	public List<Entry> getAllEntries() throws WrongApiException;
	
	
	//public Entry[] getAllEntries() throws WrongApiException;
	
//	public Entry[] getAllEntriesByCategory( String Category);

	String getAllEntriesByCategoryInString(String Category);
	
	String getHealth() throws WrongApiException;
	
	public String saveEntry(Entry entry);

}
