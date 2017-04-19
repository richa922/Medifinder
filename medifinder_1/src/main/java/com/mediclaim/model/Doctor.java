package com.mediclaim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "doctor")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Doctor {
	
	@Id
	@Column(name = "doctor_id")
	private long doctor_id;

	@Column(name = "doctor_firstname")
	private String doctor_firstname;

	@Column(name = "doctor_lastname")
	private String doctor_lastname;

	@Column(name = "doctor_emailId")
	private String doctor_emailId;
	
	@Column(name = "doctor_pwd")
	private String doctor_pwd;

	@Column(name = "hostpital_id")
	private String hostpital_id;

	@Column(name = "clinic_id")
	private String clinic_id;
	
	@Column(name = "doctor_gender")
	private int doctor_gender;
	
	@Column(name = "Speciality")
	private String Speciality;
	
	public long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_firstname() {
		return doctor_firstname;
	}

	public void setDoctor_firstname(String doctor_firstname) {
		this.doctor_firstname = doctor_firstname;
	}

	public String getDoctor_lastname() {
		return doctor_lastname;
	}

	public void setDoctor_lastname(String doctor_lastname) {
		this.doctor_lastname = doctor_lastname;
	}

	public String getDoctor_emailId() {
		return doctor_emailId;
	}

	public void setDoctor_emailId(String doctor_emailId) {
		this.doctor_emailId = doctor_emailId;
	}

	public String getDoctor_pwd() {
		return doctor_pwd;
	}

	public void setDoctor_pwd(String doctor_pwd) {
		this.doctor_pwd = doctor_pwd;
	}

	public String getHostpital_id() {
		return hostpital_id;
	}

	public void setHostpital_id(String hostpital_id) {
		this.hostpital_id = hostpital_id;
	}

	public String getClinic_id() {
		return clinic_id;
	}

	public void setClinic_id(String clinic_id) {
		this.clinic_id = clinic_id;
	}

	public int getDoctor_gender() {
		return doctor_gender;
	}

	public void setDoctor_gender(int doctor_gender) {
		this.doctor_gender = doctor_gender;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
}