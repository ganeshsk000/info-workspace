package com.project.dto;

public class FoodsDTO implements Comparable<FoodsDTO> {
	private int foodId;
	private String name;
	private double price;
	
	public FoodsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodsDTO(int foodId, String name, double price) {
		super();
		this.foodId = foodId;
		this.name = name;
		this.price = price;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodsDTO [foodId=" + foodId + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(FoodsDTO o) {
		// TODO Auto-generated method stub
		return this.getFoodId()-o.getFoodId();
	}
	
	

}
