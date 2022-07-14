package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {
	@Value("color")
	private String color;
	@Value("2.3")
	private double size;
	public Photo() {
		System.out.println("Object is created: "+this.getClass().getName());
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
