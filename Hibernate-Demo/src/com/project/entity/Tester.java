package com.project.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.employeeDAO.EmployeeDaoImpl;

public class Tester {
	public static void main(String[] args) {
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
//		impl.saveEmployeeDetails();
//		impl.getEmployeeDetailsById();
//		impl.updateEmployeeEntity();
		impl.deleteEmployeeEntity();
	}

}
