	package com.learn.Ecommerce.service;

import java.util.List;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;

public interface UserService {
//	 To add user
	UserDto adduser(UserDto userDto);
	
// To fetch All user
   List<UserDto> getAllUsers();
   
//   To fetch user By Id
   UserDto getUserById(String id);

//   update user by Id
   UserDto updateUser(String id,UserDto userDto);
   
//   To delete User by Id
  String deleteUser(String id);
  
//  Entity TO Dto Conversion
  UserDto entityToDto(User user);
  
//  Dto to entity conversionb 
    User dtoTOEntity(UserDto userDto);
   
   }
