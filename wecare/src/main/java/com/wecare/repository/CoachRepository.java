package com.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecare.entity.CoachEntity;

public interface CoachRepository extends JpaRepository<CoachEntity,String>{
	
}
