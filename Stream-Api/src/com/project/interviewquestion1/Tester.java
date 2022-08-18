package com.project.interviewquestion1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ABC", 30, "Female", "HR"));
		list.add(new Employee("PQR", 25, "Male", "IT"));
		list.add(new Employee("LMN", 30, "Male", "HR"));
		list.add(new Employee("XYZ", 28, "Female", "IT"));
		//department by distinct
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);;
		//counting by department
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);
		//averaging age,,,,,,,,,,
		Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect2);
	}

}
