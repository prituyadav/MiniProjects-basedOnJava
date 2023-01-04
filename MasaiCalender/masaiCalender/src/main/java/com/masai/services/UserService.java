package com.masai.services;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;

public interface UserService {
    public User addUser(User user)throws UserNotFoundException ;
    public String deleteUser(Integer id) throws UserNotFoundException;
    
    public User updateUser(Integer id, User user) throws UserNotFoundException;
    
}
