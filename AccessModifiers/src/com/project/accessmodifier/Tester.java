package com.project.accessmodifier;

public class Tester {
	public static void main(String[] args) {
		Train train = new Train();
		train.speed();
		
		System.out.println(train.getId()+ " "+ train.getName()+" "+train.getColor());
		System.out.println(train.id);
		System.out.println(train.name);
		System.out.println(train.color);
	}

}
