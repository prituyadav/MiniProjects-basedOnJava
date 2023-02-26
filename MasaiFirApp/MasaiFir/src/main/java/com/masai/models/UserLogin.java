package com.masai.models;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserLogin {
	
	private String password;
	private String mobNo;

}
