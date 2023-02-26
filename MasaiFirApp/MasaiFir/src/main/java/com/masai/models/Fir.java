package com.masai.models;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fir {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer FirId;
	
	
	private String crimeDetail; 
	
	private LocalDateTime timeStamp;
	
	private String policeStation;
//	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User firs;

}
