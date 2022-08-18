package com.project.checkedexception;

public class PubTester {
public static void main(String[] args) {
		
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.checkAge(17);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}


}
