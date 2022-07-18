package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainDetails")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "TRAIN_NUMBER")
	private long trainNumber;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "CANTACT_NUMBER")
	private long cantactNumber;
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int id, long trainNumber, String name, String location, long cantactNumber) {
		super();
		this.id = id;
		this.trainNumber = trainNumber;
		this.name = name;
		this.location = location;
		this.cantactNumber = cantactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getCantactNumber() {
		return cantactNumber;
	}

	public void setCantactNumber(long cantactNumber) {
		this.cantactNumber = cantactNumber;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainNumber=" + trainNumber + ", name=" + name + ", location=" + location
				+ ", cantactNumber=" + cantactNumber + "]";
	}
	
	

}
