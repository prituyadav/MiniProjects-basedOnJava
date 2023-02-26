package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.FirExceptions;
import com.masai.models.Fir;
import com.masai.models.User;
import com.masai.repos.FirRepos;
import com.masai.repos.UserRepos;

@Service
public class FirServiceImpl implements FirService{
	
	@Autowired
	private UserRepos ur;
	
	@Autowired
	private FirRepos fr;

	@Override
	public Fir addFir(Fir fir) throws FirExceptions {
      Optional<User> opt1 = ur.findById(((Object) fir).getUsers().getUserId());
		
		if(opt1.isPresent()) {
			
			return fr.save(fir);
		}
		else throw new FirExceptions("user not present of ID -> ");

	}

	@Override
	public Fir RemoveFir(Integer FirId) throws FirExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fir> getAllFirById(Integer id) throws FirExceptions {
		// TODO Auto-generated method stub
		return null;
	}

}
