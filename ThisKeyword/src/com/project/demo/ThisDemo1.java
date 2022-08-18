package com.project.demo;

public class ThisDemo1 {
	String name;
	String location;
	long cantactNumber;

	public ThisDemo1() {

	}

	public ThisDemo1(String name, String location, long cantactNumber) {
		this.name = name;
		this.location = location;
		this.cantactNumber = cantactNumber;
		System.out.println("Name: " + name + " Location: " + location + " CantactNumber " + cantactNumber);

	}

	public String displayProperties() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(cantactNumber);
		return location;
	}
	public String getDeatsils() {
		return this.displayProperties();
	}

	public static void main(String[] args) {
		ThisDemo1 demo = new ThisDemo1("Girish", "Bangalore", 65553453432l);
		demo.displayProperties();
		System.out.println("************");
		System.out.println(demo.displayProperties());
	}

}
