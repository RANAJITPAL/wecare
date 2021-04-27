package com.wecare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.dto.LoginDTO;
import com.wecare.entity.UserEntity;
import com.wecare.exception.ResourceNotFoundException;
import com.wecare.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createUser(UserEntity userEntity) {
		return userRepository.save(userEntity).toString() + "Created";
	}

	public UserEntity getUserProfile(String userId) throws ResourceNotFoundException {
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("user not fount: " + userId));
	}

	public boolean loginUser(LoginDTO loginDTO) {
		UserEntity userEntity = userRepository.findById(loginDTO.getId()).orElse(null);
		if (userEntity != null && userEntity.getPassword().equals(loginDTO.getPassword())) {
			return true;
		}
		return false;
	}

	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
	}
}
