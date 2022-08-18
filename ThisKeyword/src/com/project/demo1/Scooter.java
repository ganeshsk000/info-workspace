package com.project.demo1;

public class Scooter {
	String brand;
	String color;
	int capacity;
	float price;
	String fuel;
	
	Scooter(String brand){
		System.out.println("the brand is:"+brand);
		this.brand=brand;
	}
	
	Scooter(int capacity){
		System.out.println("the Scooter capacity is "+capacity);
		this.capacity= capacity;
	}
	
	Scooter(float price,int capacity){
		System.out.println("Scooter capacity is "+capacity);
		System.out.println("Scooter price is "+price);
		this.capacity= capacity;
		this.price= price;
	}
	
	Scooter(String color,float price){
		System.out.println("Scooter Color is "+color);
		System.out.println("Scooter price is "+price);
		this.color= color;
		this.price= price;
    }
	
	Scooter(String color,String fuel){
		System.out.println("Scooter Color is "+color);
		System.out.println("Scooter fuel is "+fuel);
		this.color= color;
		this.fuel= fuel;
	}

}
