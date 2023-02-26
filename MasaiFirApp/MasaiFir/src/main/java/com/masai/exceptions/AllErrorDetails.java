package com.masai.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AllErrorDetails {
	private LocalDateTime localTime;
	private String massege;
	private String description;
	
}
