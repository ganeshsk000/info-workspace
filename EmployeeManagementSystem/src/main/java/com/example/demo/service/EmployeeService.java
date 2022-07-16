package com.example.demo.service;

import com.example.demo.entity.Employee;

import antlr.collections.List;

public interface EmployeeService {
	java.util.List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
