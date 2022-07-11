package com.project.employeeDAO;

import java.util.List;

import com.project.entity.Employee;

public interface EmployeeDAO {
	void saveEmployeeDetails();
	void getEmployeeDetailsById();
	void updateEmployeeEntity();
	void deleteEmployeeEntity();
	List<Employee> getAllEmployee();

}
