package com.wecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/users/{userId}/booking/{coachId}")
	public ResponseEntity<String> bookAppointment(@PathVariable(value = "userId") String userId, @PathVariable(value = "coachId") String coachId,
			@RequestParam("date") String date, @RequestParam("slot") String slot){
		return ResponseEntity.ok().body(bookingService.bookAppointment(userId,coachId,date,slot));
	}
	
	@PutMapping("/booking/{bookingId}")
	public ResponseEntity<String> rescheduleAppointment(@PathVariable(value = "bookingId") String bookingId,@RequestParam("date") String date, @RequestParam("slot") String slot) {
		return ResponseEntity.ok().body(bookingService.rescheduleAppointment(bookingId, date, slot));
	}
	
	@DeleteMapping("/booking/{bookingId}")
	public ResponseEntity<?> cancelAppointment(@PathVariable(value = "bookingId") String bookingId){
		bookingService.cancelAppointment(bookingId);
		return ResponseEntity.noContent().build();
	}
}
