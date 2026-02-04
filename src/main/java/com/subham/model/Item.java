package com.subham.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	
	private int id;
	
	@NotBlank(message = "Name is Required")
	private String name;
	
	private String description;
	
	

}
