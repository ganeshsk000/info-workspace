package com.project.setdemo1;

public class School {
	private int id;
	private String name;
	private long cantactNumber;
	private String Location;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int id, String name, long cantactNumber, String location) {
		super();
		this.id = id;
		this.name = name;
		this.cantactNumber = cantactNumber;
		Location = location;
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

	public long getCantactNumber() {
		return cantactNumber;
	}

	public void setCantactNumber(long cantactNumber) {
		this.cantactNumber = cantactNumber;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", cantactNumber=" + cantactNumber + ", Location=" + Location
				+ "]";
	}
	
	

}
