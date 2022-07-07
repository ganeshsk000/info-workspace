package com.project.laptop;

public class Laptop {
	int slno;
	String name;
	String color;
	double price;
	boolean isFingerPrintSuppoerted;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int slno) {
		super();
		this.slno = slno;
	}

	public Laptop(int slno, String name) {
		super();
		this.slno = slno;
		this.name = name;
	}

	public Laptop(int slno, String name, String color) {
		super();
		this.slno = slno;
		this.name = name;
		this.color = color;
	}

	public Laptop(int slno, String name, String color, double price) {
		super();
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public Laptop(int slno, String name, String color, double price, boolean isFingerPrintSuppoerted) {
		super();
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.price = price;
		this.isFingerPrintSuppoerted = isFingerPrintSuppoerted;
	}

	@Override
	public String toString() {
		return "Laptop [slno=" + slno + ", name=" + name + ", color=" + color + ", price=" + price
				+ ", isFingerPrintSuppoerted=" + isFingerPrintSuppoerted + "]";
	}
	
	
	
	
	
	
	
}
