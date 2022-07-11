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
//		impl.updateEmployeeDesignationById(5, "CEO");
//	impl.updateEmployeeEntity(new Employee(15,"Rajesh","Senier Software Engineer", 87000, 56456435343l, false));
	impl.deleteEmployeeEntity(14);
	}
	

}
