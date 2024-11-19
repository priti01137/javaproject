package com.learn.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.service.UserService;

@RestController
@RequestMapping("/users")  // requestmapping hum log isliye use krte hai  quki /user same hai isliye

public class UserCotroller {
	@Autowired
	UserService userService;
//	post["/user"]
	@PostMapping
	public ResponseEntity<UserDto> adduser(@RequestBody UserDto userdto)
	{
		UserDto savedUser = userService.adduser(userdto);
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}

}