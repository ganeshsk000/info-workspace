package com.project.interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		Employee emp1=new Employee("Ganesh", 18000, 26);
		Employee emp2=new Employee("Guru", 15000, 27);
		Employee emp3=new Employee("Kotresh", 20000, 28);
		Employee emp4=new Employee("Gagan", 20000, 23);
		Employee emp5=new Employee("Prasad", 20000, 20);
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		List<Employee> newResult = emp.stream().map(e->{
			if(e.getAge()>25) {
				e.setSalary(e.getSalary()*1.10);
			}
		return e;	
		}).collect(Collectors.toList());
		System.out.println(newResult);
	}
	
	
	}


