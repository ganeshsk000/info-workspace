package com.project.employeeDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public void saveEmployeeDetails() {
		System.out.println("involked saveEmployeeDetails()");
		SessionFactory sessionFactory=null;
		Session session=null;

		try {
			//insetead of configuraing employee.class in java,,we can do it by xml only,,,,,,,,,,
//			configuration.addAnnotatedClass(Employee.class);
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			 sessionFactory=configuration.buildSessionFactory();
			 session=sessionFactory.openSession();
			session.beginTransaction();
			Employee employee=new Employee(13, "Ravindra", "senier devoloper", 75000, 86546565455l, true);
			session.save(employee);
			System.out.println("Data is inserted sucessfully,,,,,,,,,,,,,");
			session.getTransaction().commit();
			
		}
		catch(HibernateException e) {
			System.out.println("inside catch block excpetion,,,,,,,,,");
			System.out.println(e.getMessage());
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			if(sessionFactory!=null) {
				System.out.println("session factory is closed,,,,,,");
				sessionFactory.close();
			}
			else {
				System.out.println("session factroy is not closed,,,,,,,,,,,");
			}
		}
		
		

	}

	@Override
	public void getEmployeeDetailsById() {
		System.out.println("involked getEmployeeDetaisById");
		SessionFactory sessionFactory=null;
		Session session=null;
		try {
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory=configuration.buildSessionFactory();
			session=sessionFactory.openSession();
			session.beginTransaction();
			Employee employee=session.get(Employee.class, 5
					);
			System.out.println("Read is done: "+employee);
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			if(sessionFactory!=null) {
				System.out.println("session factory is closed,,,,,,");
				sessionFactory.close();
			}
			else {
				System.out.println("session factroy is not closed,,,,,,,,,,,");
			}
		}
	}

	@Override
	public void updateEmployeeEntity() {
		System.out.println("involked update EmployeeEntity()");
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transction=null;
		try {
			Configuration configuration=new Configuration();
			configuration.configure("Hibernate.cfg.xml");
			sessionFactory=configuration.buildSessionFactory();
			session=sessionFactory.openSession(); 
			Employee employee=session.get(Employee.class, 5);
			System.out.println("EMployee Entity Before Updating: "+employee);
			employee.setDesignation("Hr");
			employee.setCantact_number(85349656443l);
			employee.setSalary(65000);
			transction=session.beginTransaction();
			session.update(employee);
			transction.commit();
			System.out.println("Data is upfated sucessfully,,,,,,,,,,,,,,");
			System.out.println("After updating the data: "+employee);
			
			
			
			
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			transction.rollback();
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			if(sessionFactory!=null) {
				System.out.println("session factory is closed,,,,,,");
				sessionFactory.close();
			}
			else {
				System.out.println("session factroy is not closed,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void deleteEmployeeEntity() {
		System.out.println("involked deleteEmployeeEnity()");
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction trans=null;
		try {
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			sessionFactory=config.buildSessionFactory();
			session=sessionFactory.openSession();
			
			Employee employee=session.get(Employee.class, 13);
			System.out.println("Employee Enrtity: "+employee);
			trans=session.beginTransaction();
			session.delete(employee);
			trans.commit();
			System.out.println("Data is deleted sucessfully,,,,,,,,,,,,,,");
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			trans.rollback();
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			if(sessionFactory!=null) {
				System.out.println("session factory is closed,,,,,,");
				sessionFactory.close();
			}
			else {
				System.out.println("session factroy is not closed,,,,,,,,,,,");
			}
		}

	}

}
