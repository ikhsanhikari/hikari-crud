package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Cars {
	@Id
	private String vin;
	
	@Column
	private String brand;
	
	@Column
	private int year;
	
	@Column
	private String color;
	
	@Column
	private int prices;
	
	@Column
	private int type;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrices() {
		return prices;
	}

	public void setPrices(int prices) {
		this.prices = prices;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Cars(String vin, String brand, int year, String color, int prices, int type) {
		super();
		this.vin = vin;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.prices = prices;
		this.type = type;
	}
	
	public Cars() {
		
	}
}
