package com.project.facebook;

public class FaceBook {
	public void searchUser(int userId) {
		System.out.println("Serach for Id found: "+userId);
	}
	public void searchUser(long phoneNumber) {
		System.out.println("search for phone number found: "+phoneNumber);
	}
	public void searchUser(String fname,String lname) {
		System.out.println("Search for Full Name found: "+fname+" "+lname);
	}
	public void searchUser(String name) {
		System.out.println("Search for name found: "+name);
	}

}
