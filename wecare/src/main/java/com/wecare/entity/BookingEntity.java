package com.wecare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bookingtable")
public class BookingEntity {
	
	@Id
	@GenericGenerator(name = "booking_id", strategy = "com.wecare.utility.BookingIdGenerator")
    @GeneratedValue(generator = "booking_id")  
	@Column(name = "booking_id")
	private String bookingId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "coach_id")
	private String coachId;
	
	@Column(name = "appointment_date")
	private String appointmentDate;
	
	@Column(name = "slot")
	private String slot;

	public BookingEntity(String userId, String coachId, String appointmentDate, String slot) {
		super();
		this.userId = userId;
		this.coachId = coachId;
		this.appointmentDate = appointmentDate;
		this.slot = slot;
	}

	public BookingEntity() {
		super();
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}
	
}
