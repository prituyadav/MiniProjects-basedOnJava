package com.masai.services;

import com.masai.exceptions.LoginException;
import com.masai.models.UserLoginDto;

public interface UserloginS  {
	public String logIntoAccount(UserLoginDto dto)throws LoginException;

	public String logOutFromAccount(Integer id)throws LoginException;
}
