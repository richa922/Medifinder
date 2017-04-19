package com.mediclaim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "stores")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Stores extends Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7824393979278551395L;

	@Id
	@Column(name = "store_id")
	private long store_id;
	
	@Column(name = "store_address")
	private String store_address;

	@Column(name = "medicine_name")
	private String medicine_name;

	public long getStore_id() {
		return store_id;
	}

	public void setStore_id(long store_id) {
		this.store_id = store_id;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
}