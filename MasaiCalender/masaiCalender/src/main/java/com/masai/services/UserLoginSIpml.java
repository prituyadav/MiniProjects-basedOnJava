package com.masai.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.LoginException;
import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.models.UserLoginDto;
import com.masai.repos.UserRepo;

@Service
public class UserLoginSIpml implements UserloginS{
	
	
	
	  @Autowired
	  private UserRepo urepo;

	@Override
	public String logIntoAccount(UserLoginDto dto) throws LoginException {
//		Optional<User> us=urepo.findby(dto.getEmail());
//		if(us!=null)
//			throw new UserNotFoundException("user already exist");
		
		User s=urepo.save(dto);
		return "login success";
	}

	@Override
	public String logOutFromAccount(Integer id) throws LoginException {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
		return "login success";
	}

}
