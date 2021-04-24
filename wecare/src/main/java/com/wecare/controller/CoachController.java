package com.wecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.entity.CoachEntity;
import com.wecare.entity.UserEntity;
import com.wecare.service.CoachService;
import com.wecare.service.UserService;

@RestController
public class CoachController {
	
	@Autowired
	CoachService coachService;
	
	@PostMapping("/coaches")
	public ResponseEntity<String> createCoach(@RequestBody CoachEntity coachEntity){
		return ResponseEntity.ok().body(coachService.createCoach(coachEntity));
	}
	
	@GetMapping("/coaches")
	public List<CoachEntity> getAllCoaches(){
		return coachService.getAllCoaches();
	}
}
