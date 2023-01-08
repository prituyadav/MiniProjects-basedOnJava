package com.masai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.RowId;
import org.hibernate.validator.constraints.UniqueElements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emp_id;
	
	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;
	
	// email, phone number, salary (yearly Rs), reporting manager id
	 
		@NotEmpty
		@Email
		private String email;
	 
	@Pattern(regexp = "^[0-9]{10}$")
	 private String phoneNo;
	 
	  @NotNull
	  private double salary;
	
	  
	  private String manager_id;

}
