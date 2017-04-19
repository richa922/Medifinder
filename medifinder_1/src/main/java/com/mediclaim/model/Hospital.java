package com.mediclaim.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "hospital")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Hospital extends Model implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7824393979278551395L;

	@Id
	@Column(name = "hospital_id")
	private long id;

	@Column(name = "hospital_name")
	private String hospital_name;

	@Column(name = "hospital_city")
	private String hospital_city;

	@Column(name = "hostpital_address")
	private String hostpital_address;
	
	@Column(name = "hostpital_govt_pvt")
	private String hostpital_govt_pvt;

	@Column(name = "hostpital_departments")
	private Double hostpital_departments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getHospital_city() {
		return hospital_city;
	}

	public void setHospital_city(String hospital_city) {
		this.hospital_city = hospital_city;
	}

	public String getHostpital_address() {
		return hostpital_address;
	}

	public void setHostpital_address(String hostpital_address) {
		this.hostpital_address = hostpital_address;
	}

	public String getHostpital_govt_pvt() {
		return hostpital_govt_pvt;
	}

	public void setHostpital_govt_pvt(String hostpital_govt_pvt) {
		this.hostpital_govt_pvt = hostpital_govt_pvt;
	}

	public Double getHostpital_departments() {
		return hostpital_departments;
	}

	public void setHostpital_departments(Double hostpital_departments) {
		this.hostpital_departments = hostpital_departments;
	}
}
