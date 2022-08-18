package com.project.constructorreference;

public class Tester {
	public static void main(String[] args) {
		//studying constructor reference
/*		StudentProvider provider=()->{
		return	new Student();
 	};
*/				
 //instead of writing above code,,we can refer the constructor
 StudentProvider provider=Student::new;
 Student student = provider.getStudent();
		student.display();
	}

}
