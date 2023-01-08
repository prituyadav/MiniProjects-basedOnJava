package com.masai.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
  @Autowired
  private UserRepo urepo;

@Override
public User addUser(User user) throws UserNotFoundException  {
	Optional<User> us=urepo.findById(user.getUserId());
	if(us!=null)
		throw new UserNotFoundException("user already exist");
	
	User s=urepo.save(user);
	return s;
}

@Override
public String deleteUser(Integer id) throws UserNotFoundException {
	Optional<User> us=urepo.findById(id);
	if(us==null)
		throw new UserNotFoundException("user doesn't exist");
	urepo.deleteById(id);
	return "user deleted successfully";
}

@Override
public User updateUser(Integer id,User user) throws UserNotFoundException {
	Optional<User> us=urepo.findById(id);
	if(us==null)
		throw new UserNotFoundException("user already exist");
	
	User s=urepo.save(user);
	return s;
	
}

 
  
}