package com.project.aggrigation;

public class Tester {
	public static void main(String[] args) {
		Student student=new Student();
		student.id=101;
		student.name="Raghu";
		student.collageName="Jain institute of technology";
		
		Liberary liberary=new Liberary();
		liberary.name="Winner Digital liberary";
		liberary.location="Mysore";
		liberary.cantactNumber=985746536l;
		liberary.student=student;
		System.out.println(liberary.student.id);
		System.out.println(liberary.student.name);
		System.out.println(liberary.student.collageName);
		System.out.println("**************************");
		liberary.student.displayDetails();
	}

}
