package com.project.hierartical;

public class Tester {
	public static void main(String[] args) {
		Ipl ipl=new Ipl();
		ipl.players();
		ipl.overs();
		ipl.maxOvers();
		System.out.println("*********************");
		Rcb rcb=new Rcb();
		rcb.players();
		rcb.overs();
		rcb.maxOvers();
		rcb.capton();
		System.out.println("**********************");
		Chennai chennai=new Chennai();
		chennai.players();
		chennai.overs();
		chennai.maxOvers();
		chennai.capton();
		System.out.println("*********************");
		Mumbai mumbai=new Mumbai();
		mumbai.players();
		mumbai.overs();
		mumbai.maxOvers();
		mumbai.capton();
	}

}
