package com.project.demo3;

public class Tester {
	public static void main(String[] args) {
		ThisDemo demo=new ThisDemo(11, "Ganesh");
		ThisDemo demo1=new ThisDemo(12);
		System.out.println(demo1);
		System.out.println(demo);
		demo.displayProperties();
	}

}
