package com.wecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wecare.entity.UserEntity;
import com.wecare.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/{userId}")
	public UserEntity getUserProfile(@PathVariable(value = "userId") String userId) {
		return userRepository.getOne(userId);
	}
}
