package com.project.wallet;

public class Photo {
	private String color;
	private double size;
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(String color, double size) {
		super();
		this.color = color;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Photo [color=" + color + ", size=" + size + "]";
	}
	
	

}
