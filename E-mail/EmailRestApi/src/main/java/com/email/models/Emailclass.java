package com.email.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emailclass {
	
	@NotEmpty
	@javax.validation.constraints.Email
    private String from;
    
	@NotEmpty
	@javax.validation.constraints.Email
    private String to;
    
	@NotEmpty
    private String subject;
    
	
	@NotEmpty
    private String message;
    
}
