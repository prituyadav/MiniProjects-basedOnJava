package com.masai.services;

import java.util.List;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;

public interface UserServices {
	public User registerUser(User user)throws UserNotFoundException;
	public User updateUser(User user)throws UserNotFoundException;
	public User getById(Integer userId)throws UserNotFoundException;
	public List<User> getAllUsers() throws UserNotFoundException;

}
