package com.wecare.service;

import java.util.List;

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
	
	public String rescheduleAppointment(String bookingId, String date, String slot) {
		BookingEntity booking = bookingRepository.getOne(bookingId);
		booking.setAppointmentDate(date);
		booking.setSlot(slot);
		return bookingRepository.save(booking).toString()+"changed successfully";
	}
	
	public void cancelAppointment(String bookingId) {
		bookingRepository.deleteById(bookingId);
	}
	
	public List<BookingEntity> findByUserId(String userId) {
		return bookingRepository.findByUserId(userId);
	}
}
