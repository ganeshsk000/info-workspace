package com.project.demo1;

public class Tester {
	public static void main(String[] args) {
		Scooter scooter1 = new Scooter("VESPA");
		System.out.println(scooter1);
		System.out.println("***************************************");
			
		Scooter scooter2 = new Scooter(124);
		System.out.println(scooter2);
		System.out.println("***************************************");
		
		Scooter scooter3 = new Scooter(95000.00f,121);
		System.out.println(scooter3);
		System.out.println("***************************************");
		
		Scooter scooter4 = new Scooter("RED",85000.00f);
		System.out.println(scooter4);
		System.out.println("***************************************");
		
		Scooter scooter5 = new Scooter("YELLOW","PETROL");
		System.out.println(scooter5);
		System.out.println("***************************************");
		}
	
	}


