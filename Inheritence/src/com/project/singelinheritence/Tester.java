package com.project.singelinheritence;

public class Tester {
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eatFood();
		animal.sleep();
		animal.walk();
		System.out.println("**********************");
		
		Dog dog=new Dog();
		dog.eatFood();
		dog.sleep();
		dog.walk();
		dog.barking();
		dog.haveFourLegs();
		
		Cow cow=new Cow();
		cow.eatFood();
		cow.sleep();
		cow.walk();
		cow.barking();;
		cow.haveFourLegs();
		cow.provideMilk();
		cow.eatGrass();
	}

}
