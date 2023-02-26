package com.masai.services;

import java.util.List;

import com.masai.exceptions.FirExceptions;
import com.masai.models.Fir;

public interface FirService {

	public Fir addFir(Fir fir) throws FirExceptions;
	
	public Fir RemoveFir(Integer FirId) throws FirExceptions;
	
	public List<Fir> getAllFirById(Integer id) throws FirExceptions;
}
