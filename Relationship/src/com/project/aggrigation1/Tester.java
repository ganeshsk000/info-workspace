package com.project.aggrigation1;

public class Tester {
	public static void main(String[] args) {
		Radio radio=new Radio();
		radio.name="Akashvani";
		radio.frequency="101hz";
		radio.program="News";
		
		Car car=new Car();
		car.name="shift";
		car.price=800000;
		car.color="Red";
		car.radio=radio;
		System.out.println(car.radio.name);
		System.out.println(car.radio.frequency);
		System.out.println(car.radio.program);
		
	}

}
