package com.wecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.entity.UserEntity;
import com.wecare.exception.ResourceNotFoundException;
import com.wecare.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<UserEntity> getUserProfile(@PathVariable(value = "userId") String userId) 
	throws ResourceNotFoundException {
		System.out.println("test id = "+userId);
		UserEntity userEntity = userRepository.findById(userId)
				.orElseThrow(()->new ResourceNotFoundException("user not fount: "+userId));
		return ResponseEntity.ok().body(userEntity);
	}
	
	@PostMapping("/users")
	public UserEntity createUser(@RequestBody UserEntity userEntity) {
		return userRepository.save(userEntity);
	}
	
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		return userRepository.findAll();
	}
}
