package com.project.interviewquestion;

public class Employee {
private String name;
private double salary;
private int age;
public String getName() {
	return name;
}


public Employee(String name, int salary, int age) {
	super();
	this.name = name;
	this.salary = salary;
	this.age = age;
}


public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double d) {
	this.salary = d;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
}


}
