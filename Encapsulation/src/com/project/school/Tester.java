package com.project.school;

public class Tester {
public static void main(String[] args) {
	School school=new School();
	school.setId(101);
	school.setName("IIT");
	school.setLocation("Bangalore");
	school.setCbscIsThere(true);
	
	System.out.println(school.getId());
	System.out.println(school.getName());
	System.out.println(school.getLocation());
	System.out.println(school.getCantactNumber());
}
}
