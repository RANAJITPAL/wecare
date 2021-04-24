package com.wecare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "coachtable")
public class CoachEntity {
	
	@Id
	@GenericGenerator(name = "coach_id", strategy = "com.wecare.utility.CoachIdGenerator")
    @GeneratedValue(generator = "coach_id")  
	@Column(name = "coach_id")
	private String coachId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "speciality")
	private String speciality;

	public CoachEntity() {
		super();
	}

	public CoachEntity(String name, String password, String gender, String dateOfBirth, String mobileNumber,
			String speciality) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.speciality = speciality;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "CoachEntity [coachId=" + coachId + ", name=" + name + ", password=" + password + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNumber=" + mobileNumber + ", speciality=" + speciality
				+ "]";
	}
	
}
