package com.learn.Ecommerce.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO- Data Transfer Object

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String confirmPassword;
	private String age;
	
}
