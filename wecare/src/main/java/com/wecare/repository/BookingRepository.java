package com.wecare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecare.entity.BookingEntity;

public interface BookingRepository  extends JpaRepository<BookingEntity,String>{
	
	List<BookingEntity> findByUserId(String userId);
}
