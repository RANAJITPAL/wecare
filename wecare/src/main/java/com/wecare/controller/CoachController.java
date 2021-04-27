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
import com.wecare.entity.CoachEntity;
import com.wecare.exception.ResourceNotFoundException;
import com.wecare.service.CoachService;

@RestController
public class CoachController {
	
	@Autowired
	CoachService coachService;
	
	@PostMapping("/coaches")
	public ResponseEntity<String> createCoach(@RequestBody CoachEntity coachEntity){
		return ResponseEntity.ok().body(coachService.createCoach(coachEntity));
	}
	
	@GetMapping("/coaches/all")
	public List<CoachEntity> getAllCoaches(){
		return coachService.getAllCoaches();
	}
	
	@PostMapping("/coaches/login")
	public ResponseEntity<Boolean> loginUser(@RequestBody LoginDTO loginDTO) {
		System.out.println(loginDTO.toString());
		return ResponseEntity.ok().body(coachService.loginCoach(loginDTO));
	}
	
	@GetMapping("/coaches/{coachId}")
	public ResponseEntity<CoachEntity> getCoachProfile(@PathVariable(value = "coachId") String coachId ) 
			throws ResourceNotFoundException{
		return ResponseEntity.ok().body(coachService.getCoachProfile(coachId));
	}
	
}
