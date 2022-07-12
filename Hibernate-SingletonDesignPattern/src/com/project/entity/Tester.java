package com.project.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.employeeDAO.EmployeeDaoImpl;

public class Tester {
	public static void main(String[] args) {
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
		Employee employee=new Employee("Asif", "Java devoloper", 62000, 98643534544l, false);
//		impl.saveEmployeeEntity(employee);
//		impl.getEmployeeEntityById(4);
//		impl.getAllEmployeeEntity();
//	impl.updateEmployeeDesignationById(13, "Java Devoloper");
//	impl.updateEmployeeEntity(new Employee(13,"Ganesh","Java devoloper", 30000, 56456435343l, true));
	impl.deleteEmployeeEntity(13);
	}
	

}
