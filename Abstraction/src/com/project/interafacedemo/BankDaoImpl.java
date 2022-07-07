package com.project.interafacedemo;

public class BankDaoImpl implements BankDAO {

	@Override
	public void createAccount() {
		System.out.println("BankDaoImpl.createAccount()");

	}

	
	public void withdraw() {
		System.out.println("BankDaoImpl.withdraw()");
	}

	@Override
	public void deposit() {
		System.out.println("BankDaoImpl.deposit()");
	}

	@Override
	public void checkMinimumBalance() {
		System.out.println("BankDaoImpl.checkMinimumBalance()");

	}

	@Override
	public void addMobileNumber() {
		System.out.println("BankDaoImpl.addMobileNumber()");

	}

	@Override
	public void applyLoan() {
		System.out.println("BankDaoImpl.applyLoan()");

	}

	@Override
	public void applyCheckBook() {
		System.out.println("BankDaoImpl.applyCheckBook()");

	}

}
