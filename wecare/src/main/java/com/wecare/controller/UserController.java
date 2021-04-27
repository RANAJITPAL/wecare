package com.wecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.dto.LoginDTO;
import com.wecare.entity.UserEntity;
import com.wecare.exception.ResourceNotFoundException;
import com.wecare.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users/{userId}")
	public ResponseEntity<UserEntity> getUserProfile(@PathVariable(value = "userId") String userId)
			throws ResourceNotFoundException {
		return ResponseEntity.ok().body(userService.getUserProfile(userId));
	}

	@PostMapping("/users")
	public ResponseEntity<String> createUser(@RequestBody UserEntity userEntity) {
		return ResponseEntity.ok().body(userService.createUser(userEntity));
	}

	@PostMapping("/users/login")
	public ResponseEntity<Boolean> loginUser(@RequestBody LoginDTO loginDTO) {
		System.out.println(loginDTO.toString());
		return ResponseEntity.ok().body(userService.loginUser(loginDTO));
	}
	
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		return userService.getAllUser();
	}
}
