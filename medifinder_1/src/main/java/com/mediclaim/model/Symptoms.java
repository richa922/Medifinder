package com.mediclaim.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "symptoms")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Symptoms extends Model implements Serializable 
{
	private static final long serialVersionUID = 7824393979278551395L;

	@Id
	@Column(name = "id_symptoms ")
	private int id_symptoms;
	
	@Column(name = "symptoms_name ")
	private String symptoms_name;
	
	@Column(name = "symptoms_curing_medicine ")
	private String symptoms_curing_medicine;
	
	@Column(name = "symptoms_prediction ")
	private String symptoms_prediction;
	
	@Column(name = "symptoms_disease ")
	private String symptoms_disease;
	
	public int getId_symptoms() {
		return id_symptoms;
	}

	public void setId_symptoms(int id_symptoms) {
		this.id_symptoms = id_symptoms;
	}

	public String getSymptoms_name() {
		return symptoms_name;
	}

	public void setSymptoms_name(String symptoms_name) {
		this.symptoms_name = symptoms_name;
	}

	public String getSymptoms_curing_medicine() {
		return symptoms_curing_medicine;
	}

	public void setSymptoms_curing_medicine(String symptoms_curing_medicine) {
		this.symptoms_curing_medicine = symptoms_curing_medicine;
	}

	public String getSymptoms_prediction() {
		return symptoms_prediction;
	}

	public void setSymptoms_prediction(String symptoms_prediction) {
		this.symptoms_prediction = symptoms_prediction;
	}

	public String getSymptoms_disease() {
		return symptoms_disease;
	}

	public void setSymptoms_disease(String symptoms_disease) {
		this.symptoms_disease = symptoms_disease;
	}
}