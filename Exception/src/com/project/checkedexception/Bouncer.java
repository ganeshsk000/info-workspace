package com.project.checkedexception;

public class Bouncer {
public void checkAge(int age) throws PubException {
		
		if(age < 18) {
			
//			PubException exception = new PubException();
			throw new PubException();
			
		}else {
			System.out.println("You can enter and enjoyyy");
		}
	}
}
