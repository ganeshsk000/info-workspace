package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column (name = "NAME")
	private String name;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "CANTACT_NUMBER")
	private long cantact_number;
	
	@Column(name = "IS_TRAINED")
	private boolean is_Trained;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, int salary, long cantact_number, boolean is_Trained) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.cantact_number = cantact_number;
		this.is_Trained = is_Trained;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getCantact_number() {
		return cantact_number;
	}

	public void setCantact_number(long cantact_number) {
		this.cantact_number = cantact_number;
	}

	public boolean isIs_Trained() {
		return is_Trained;
	}

	public void setIs_Trained(boolean is_Trained) {
		this.is_Trained = is_Trained;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", cantact_number=" + cantact_number + ", is_Trained=" + is_Trained + "]";
	}
	
	

}
