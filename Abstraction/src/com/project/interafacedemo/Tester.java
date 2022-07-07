package com.project.interafacedemo;

public class Tester {
	public static void main(String[] args) {
		BankDaoImpl impl=new BankDaoImpl();
		impl.createAccount();
		impl.addMobileNumber();
		impl.applyCheckBook();
		impl.applyLoan();
		impl.deposit();
		impl.withdraw();
		
	}

}
