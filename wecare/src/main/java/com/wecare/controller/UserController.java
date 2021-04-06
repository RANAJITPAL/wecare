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
import com.wecare.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<UserEntity> getUserProfile(@PathVariable(value = "userId") String userId) 
	throws ResourceNotFoundException {
		//System.out.println("test id = "+userId);
		UserEntity userEntity = userRepository.findById(userId)
				.orElseThrow(()->new ResourceNotFoundException("user not fount: "+userId));
		return ResponseEntity.ok().body(userEntity);
	}
	
	@PostMapping("/users")
	public UserEntity createUser(@RequestBody UserEntity userEntity) {
		return userRepository.save(userEntity);
	}
	
	@PostMapping("/users/login")
	public ResponseEntity<Boolean> loginUser(@RequestBody LoginDTO loginDTO) {
		
		System.out.println(loginDTO.toString());
		UserEntity userEntity= userRepository.findById(loginDTO.getUserId()).orElse(null);
//		UserEntity userEntity = userRepository.getOne(loginDTO.getUserId());
//		System.out.println("test 1"+(userEntity != null));
//		System.out.println("test 2"+userEntity.getPassword().equals(loginDTO.getPassword()));
		if(userEntity != null && userEntity.getPassword().equals(loginDTO.getPassword())) {
			return ResponseEntity.ok().body(true);
		}
		return ResponseEntity.ok().body(false);
	}
	
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		return userRepository.findAll();
	}
}
