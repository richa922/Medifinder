package com.mediclaim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "pill")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Pill {
	
	@Id
	@Column(name = "imprint")
	private String imprint;

	@Column(name = "color")
	private String color;

	@Column(name = "shape")
	private String shape;

	@Column(name = "strength")
	private String strength;
	
	@Column(name = "size")
	private String size;

	@Column(name = "img")
	private String img;

	@Column(name = "pillName")
	private String pillName;

	public String getImprint() {
		return imprint;
	}

	public void setImprint(String imprint) {
		this.imprint = imprint;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPillName() {
		return pillName;
	}

	public void setPillName(String pillName) {
		this.pillName = pillName;
	}
}