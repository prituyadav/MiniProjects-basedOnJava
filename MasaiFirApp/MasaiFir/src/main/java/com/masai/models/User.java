package com.masai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@NotEmpty
	private String firstName ;
	
	@NotEmpty 
	String lastName;
	
	@NotEmpty
	@Size(min = 10, max = 10, message = "mobile No.  must be exact 10 digit !!")
	@Digits(fraction = 0, integer = 10, message = "mobile No. should contains the number only !!")
	private String mobileNumber;
	
	@NotEmpty
	private String address;
	
	private Integer age;
	@NotEmpty
	private String gender;
	

	@NotEmpty
	@Size(min = 4, max=10, message = "customer password should contains the minimum 4 and maximum 10 chars !!")
	private String password ;

	@JsonIgnore
	@OneToMany(mappedBy = "firs")
	private List<Fir> firList;
}
