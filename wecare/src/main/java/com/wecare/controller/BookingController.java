package com.wecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
}
