package com.project.decisionmaking;

public class NestedIf {
	
	public static void main(String[] args) {
		boolean haveBankAccount=true;
		String AccountNumber="SBI";
		boolean haveMinimumBalance=true;
		int salary=25000;
		
		if(haveBankAccount) {
			if(AccountNumber.startsWith("SBI")) {
				if(haveMinimumBalance) {
					if(salary>20000) {
						System.out.println("you are eligible for the credit card,,,,,,,");
					}
					else {
						System.out.println("soorry,salary is less than 20k");
					}
				}
				else {
					System.out.println("sorry,,you are not having minimum balance");
				}
			}
			else {
				System.out.println("your account number is not matched,,,,,,,,,");
			}
		}
		else {
			System.out.println("plase apply for bank account,,,,,,,,,,,,,");
		}
	}

}
