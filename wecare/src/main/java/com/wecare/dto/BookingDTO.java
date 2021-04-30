package com.wecare.dto;

public class BookingDTO {
	
	private String userId;
	private String coachId;
	private String date;
	private String slot;
	
	public BookingDTO() {
		super();
	}

	public BookingDTO(String userId, String coachId, String date, String slot) {
		super();
		this.userId = userId;
		this.coachId = coachId;
		this.date = date;
		this.slot = slot;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "BookingDTO [userId=" + userId + ", coachId=" + coachId + ", date=" + date + ", slot=" + slot + "]";
	}
	
	
}
