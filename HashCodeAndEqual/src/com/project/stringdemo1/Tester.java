package com.project.stringdemo1;

public class Tester {
	public static void main(String[] args) {
		Mobile mobile=new Mobile(1, "Sony", "Japan");
		Mobile mobile1=new Mobile(1, "Sony", "Japan");
		
		System.out.println(mobile==mobile1);
		System.out.println(mobile.equals(mobile1));
		System.out.println(mobile.hashCode());
		System.out.println(mobile1.hashCode());
	}

}
