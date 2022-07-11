package com.project.employeeDAO;

import java.util.List;

import com.project.entity.Employee;

public interface EmployeeDAO {
	void saveEmployeeEntity(Employee employee);
	void getEmployeeEntityById(int id);
	List<Employee> getAllEmployeeEntity();
	void updateEmployeeDesignationById(int id,String designation);
	void updateEmployeeEntity(Employee employee);
	void deleteEmployeeEntity(int id);

}
