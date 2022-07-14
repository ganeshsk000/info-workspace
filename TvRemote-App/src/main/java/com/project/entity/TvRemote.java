package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tv_remote")
public class TvRemote {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc",strategy = "increment")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "NO_OF_SHELL")
	private int noOfShell;
	
	@Column(name = "IS_POWER_BUTTON_WORKING")
	private boolean isPowerButtonWorking;
	
	public TvRemote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TvRemote(String name, String brand, String color, double price, int noOfShell,
			boolean isPowerButtonWorking) {
		super();
		
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.noOfShell = noOfShell;
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfShell() {
		return noOfShell;
	}

	public void setNoOfShell(int noOfShell) {
		this.noOfShell = noOfShell;
	}

	public boolean isPowerButtonWorking() {
		return isPowerButtonWorking;
	}

	public void setPowerButtonWorking(boolean isPowerButtonWorking) {
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	@Override
	public String toString() {
		return "TvRemote [id=" + id + ", name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price
				+ ", noOfShell=" + noOfShell + ", isPowerButtonWorking=" + isPowerButtonWorking + "]";
	}
	
	
	

}
