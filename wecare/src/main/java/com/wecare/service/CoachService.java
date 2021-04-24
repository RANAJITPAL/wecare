package com.wecare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.entity.CoachEntity;
import com.wecare.exception.ResourceNotFoundException;
import com.wecare.repository.CoachRepository;

@Service
public class CoachService {
	
	@Autowired
	CoachRepository coachRepository;
	
	public String createCoach(CoachEntity coachEntity) {
		return coachRepository.save(coachEntity).toString() + "Created";
	}
	
	public CoachEntity getCoachProfile(String coachId) throws ResourceNotFoundException {
		return coachRepository.findById(coachId)
				.orElseThrow(()-> new ResourceNotFoundException("coach not found "+coachId));
	}
	
	public List<CoachEntity> getAllCoaches(){
		return coachRepository.findAll();
	}
	
}
