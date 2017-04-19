package com.mediclaim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "doctor_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DoctorDetails implements Serializable
{
	private static final long serialVersionUID = 7824393979278551395L;

	@Id
	@Column(name = "fk_doctor_id ")
	private int fk_doctor_id;

	public int getFk_doctor_id() {
		return fk_doctor_id;
	}

	public void setFk_doctor_id(int fk_doctor_id) {
		this.fk_doctor_id = fk_doctor_id;
	}

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

	public int getMedicine_salts_id() {
		return medicine_salts_id;
	}

	public void setMedicine_salts_id(int medicine_salts_id) {
		this.medicine_salts_id = medicine_salts_id;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Column(name = "no_of_days")
	private int no_of_days;

	@Column(name = "medicine_salts_id")
	private int medicine_salts_id;

	@Column(name = "timings")
	private String timings;
	
	@Column(name = "qualification")
	private String qualification;

	@Column(name = "fee")
	private int fee;
}