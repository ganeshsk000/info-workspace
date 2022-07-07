package com.project.dto;

public class MedicineDTO implements Comparable<MedicineDTO>{
	private int medincineID;
	private String name;
	private double price;
	
	public MedicineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineDTO(int medincineID, String name, double price) {
		super();
		this.medincineID = medincineID;
		this.name = name;
		this.price = price;
	}

	public int getMedincineID() {
		return medincineID;
	}

	public void setMedincineID(int medincineID) {
		this.medincineID = medincineID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MedicineDTO [medincineID=" + medincineID + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(MedicineDTO o) {
		// TODO Auto-generated method stub
		return this.getMedincineID()-o.getMedincineID();
	}
	
	
	

}
