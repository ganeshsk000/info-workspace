package com.project.overriding;

public class Tester {
	public static void main(String[] args) {
		RBI rbi=new RBI();
		rbi.displayIntrestRate();
		
		Hdfc hdfc=new Hdfc();
		hdfc.displayIntrestRate();
		
		RBI rbi1=new Hdfc();
		rbi1.displayIntrestRate();
		
	}
}
