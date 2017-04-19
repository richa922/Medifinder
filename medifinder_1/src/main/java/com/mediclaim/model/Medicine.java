package com.mediclaim.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "medicine")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Medicine extends Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7824393979278551395L;

	@Id
	@Column(name = "id_medicine")
	private long id;

	@Column(name = "medicine_name")
	private String medicine_name;

	@Column(name = "medicine_salts_id")
	private String medicine_salts_id;

	@Column(name = "medicine_unique_id")
	private String medicine_unique_id;
	
	@Column(name = "medicine_company_id")
	private String medicine_company_id;

	@Column(name = "medicine_MRP")
	private Double medicine_MRP;

	@Column(name = "medicine_mg")
	private String medicine_mg;
	
	@Column(name = "medicine_expiry_date")
	private Date medicine_expiry_date;

	@Column(name="storeid")
	private Integer storeId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public String getMedicine_unique_id() {
		return medicine_unique_id;
	}

	public void setMedicine_unique_id(String medicine_unique_id) {
		this.medicine_unique_id = medicine_unique_id;
	}

	public String getMedicine_company_id() {
		return medicine_company_id;
	}

	public void setMedicine_company_id(String medicine_company_id) {
		this.medicine_company_id = medicine_company_id;
	}

	public String getMedicine_mg() {
		return medicine_mg;
	}

	public void setMedicine_mg(String medicine_mg) {
		this.medicine_mg = medicine_mg;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getMedicine_salts_id() {
		return medicine_salts_id;
	}

	public void setMedicine_salts_id(String medicine_salts_id) {
		this.medicine_salts_id = medicine_salts_id;
	}

	public Double getMedicine_MRP() {
		return medicine_MRP;
	}

	public void setMedicine_MRP(Double medicine_MRP) {
		this.medicine_MRP = medicine_MRP;
	}


	public Date getMedicine_expiry_date() {
		return medicine_expiry_date;
	}

	public void setMedicine_expiry_date(Date medicine_expiry_date) {
		this.medicine_expiry_date = medicine_expiry_date;
	}
}