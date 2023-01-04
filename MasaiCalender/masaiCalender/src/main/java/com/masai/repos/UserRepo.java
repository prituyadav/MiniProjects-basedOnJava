package com.masai.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.User;
import com.masai.models.UserLoginDto;

public interface UserRepo extends JpaRepository<User, Integer>{

	User save(UserLoginDto dto);
   
}
