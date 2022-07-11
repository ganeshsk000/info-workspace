package com.project.employeeDAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.entity.Employee;
import com.projectsessionfactoryprovider.SessionFactoryProvider;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public void saveEmployeeDetails() {
		System.out.println("involked saveEmployeeDetails()");
		SessionFactory sessionFactory=null;
		Session session=null;

		try {
			sessionFactory=SessionFactoryProvider.getSessionFactory();
			 session=sessionFactory.openSession();
			session.beginTransaction();
			Employee employee=new Employee( "prashanth", "senier devoloper", 75000, 86546565455l, true);
			session.save(employee);
			
			session.getTransaction().commit();
			System.out.println("Data is inserted sucessfully,,,,,,,,,,,,,");
			
		}
		catch(HibernateException e) {
			System.out.println("inside catch block excpetion,,,,,,,,,");
			System.out.println(e.getMessage());
		}
		finally {
			
			
			if(session!=null) {
				System.out.println("session is closed,,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}
		
		

	}

	@Override
	public void getEmployeeDetailsById() {
		System.out.println("involked getEmployeeDetaisById");
		SessionFactory sessionFactory=null;
		Session session=null;
		try {
			sessionFactory=SessionFactoryProvider.getSessionFactory();
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
			SessionFactoryProvider.CloseSessionFactory();
		}
	}

	@Override
	public void updateEmployeeEntity() {
		System.out.println("involked update EmployeeEntity()");
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transction=null;
		try {
			sessionFactory=SessionFactoryProvider.getSessionFactory();
			session=sessionFactory.openSession(); 
			Employee employee=session.get(Employee.class, 13);
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
			SessionFactoryProvider.CloseSessionFactory();
		}

	}

	@Override
	public void deleteEmployeeEntity() {
		System.out.println("involked deleteEmployeeEnity()");
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction trans=null;
		try {
			sessionFactory=SessionFactoryProvider.getSessionFactory();
			session=sessionFactory.openSession();
			
			Employee employee=session.get(Employee.class, 17);
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
			SessionFactoryProvider.CloseSessionFactory();
		}

	}

	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("involked getEmployeeDetailsEnity()");
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			sessionFactory=SessionFactoryProvider.getSessionFactory();
			session=sessionFactory.openSession();
			String hqlQuery="From Employee";
			Query query=session.createQuery(hqlQuery);
			List<Employee> list=query.list();
			System.out.println("List of employee: "+list);
			
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
finally {
	if(session!=null) {
		System.out.println("session is closed,,,,,,,,,,,");
		session.close();
	}
	else {
		System.out.println("session is not closed,,,,,,,,,,,,,,");
	}
	SessionFactoryProvider.CloseSessionFactory();
}
		return null;

	}
	
}



