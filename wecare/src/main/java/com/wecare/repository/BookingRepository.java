package com.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecare.entity.BookingEntity;

public interface BookingRepository  extends JpaRepository<BookingEntity,String>{
	
}
