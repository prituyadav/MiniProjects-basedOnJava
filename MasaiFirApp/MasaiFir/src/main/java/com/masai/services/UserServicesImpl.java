package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.repos.FirRepos;
import com.masai.repos.UserRepos;

@Service
public class UserServicesImpl implements UserServices{
	@Autowired
	private UserRepos ur;

	@Autowired
	private FirRepos fr;
	
	@Override
	public User registerUser(User user) throws UserNotFoundException {
		
				Optional<User> opt = ur.findById(user.getUserId());
				
				if(opt.isPresent()) {
					
					ur.save(user);
					return user;
				}
				else throw new UserNotFoundException("User doesn't exist with this id _-> " + user.getUserId());
		
		
	}

	@Override
	public User updateUser(User user) throws UserNotFoundException {

		Optional<User> opt = ur.findById(user.getUserId());
		
		if(opt.isPresent()) {
			
			ur.save(user);
			return user;
		}
		else throw new UserNotFoundException("User doesn't exist with this id _-> " + user.getUserId());
	}

	@Override
	public User getById(Integer userId) throws UserNotFoundException {
		Optional<User> opt = ur.findById(userId);
		
		if(opt.isPresent()) {
			User u = opt.get();
			return u;
		}
		else throw new UserNotFoundException("User doesn't exist with this id _-> " + userId);
	}

	@Override
	public List<User> getAllUsers() throws UserNotFoundException {
		List<User> list = ur.findAll();
		if(list.size() == 0)
			throw new UserNotFoundException("Not any user present here ");
		return list;
	}

}
