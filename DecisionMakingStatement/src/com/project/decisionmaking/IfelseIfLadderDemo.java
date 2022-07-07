package com.project.decisionmaking;

public class IfelseIfLadderDemo {
	public static void main(String[] args) {
		boolean haveAdharCard=false;
		boolean haveInfoysisId=true;
		boolean haveLaptop=true;
		
		if(haveAdharCard) {
			System.out.println("you are eligible for gate pass,,,,,,,,");
		}
		else if(haveInfoysisId) {
			System.out.println("you are eligible for acomadation,,,,,,,,,");
		}
		else if(haveLaptop) {
			System.out.println("you are eligible for allowing java training sessions");
		}
		else {
			System.out.println("Byee,,,,,,,,bye,,,,,,,,,");
		}
	}

}
