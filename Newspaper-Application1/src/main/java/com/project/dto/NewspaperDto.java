package com.project.dto;

public class NewspaperDto {
	private int id;
	private String newspaperName;
	private double price;
	private String language;
	private int noOfPages;
	
	

	public NewspaperDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public NewspaperDto(int id, String newspaperName, double price, String language, int noOfPages) {
		super();
		this.id = id;
		this.newspaperName = newspaperName;
		this.price = price;
		this.language = language;
		this.noOfPages = noOfPages;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNewspaperName() {
		return newspaperName;
	}



	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public int getNoOfPages() {
		return noOfPages;
	}



	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}



	@Override
	public String toString() {
		return "NewspaperDto [id=" + id + ", newspaperName=" + newspaperName + ", price=" + price + ", language="
				+ language + ", noOfPages=" + noOfPages + "]";
	}
	
	
	

}
