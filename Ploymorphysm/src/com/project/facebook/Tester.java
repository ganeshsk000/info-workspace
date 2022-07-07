package com.project.facebook;

public class Tester {
	public static void main(String[] args) {
		FaceBook fb=new FaceBook();
		fb.searchUser(101);
		fb.searchUser(8548078525l);
		fb.searchUser("steve");
		fb.searchUser("steve","jobs");
	}

}
