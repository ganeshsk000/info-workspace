package com.project.laptop;

public class Tester {
	public static void main(String[] args) {
		Laptop laptop=new Laptop(1);
		System.out.println(laptop);
		Laptop laptop1=new Laptop(2, "Dell");
		System.out.println(laptop1);
//		System.out.println("**********************8");
		Laptop laptop2=new Laptop(3, "Dell pro", "White");
		System.out.println(laptop2);
		Laptop laptop3=new Laptop(4, "Dell", "Black", 25000.00);
		System.out.println(laptop3);
		Laptop laptop4=new Laptop(5, "Dell", "White", 32000.00, false);
		System.out.println(laptop4);
	}
//		System.out.println(laptop.slno);
//		System.out.println("***************");

//		System.out.println(laptop2.slno);
//		System.out.println(laptop2.name);
//		System.out.println(laptop2.color);
//		System.out.println(laptop1.slno);
//		System.out.println(laptop1.name);
}
