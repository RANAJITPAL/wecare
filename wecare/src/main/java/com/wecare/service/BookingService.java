package com.wecare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.dto.BookingDTO;
import com.wecare.entity.BookingEntity;
import com.wecare.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	public String bookAppointment(String userId, String coachId, String date, String slot){
		
		return bookingRepository.save(new BookingEntity(userId,coachId,date,slot)).toString()+"booked";
	}
}
