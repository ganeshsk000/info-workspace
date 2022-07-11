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
	public void saveEmployeeEntity(Employee employee) {
		System.out.println("involked save employeeEntity()");
		SessionFactory sessionfactory = null;
		Session session = null;

		try {
			sessionfactory = SessionFactoryProvider.getSessionFactory();
			session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			System.out.println("Data is inserted sucessfully,,,,,,,,,,,,,");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}

	}

	@Override
	public void getEmployeeEntityById(int id) {
		System.out.println("involked get EMployeeEnity by id()");
		SessionFactory sessionFactroy = null;
		Session session = null;
		try {
			sessionFactroy = SessionFactoryProvider.getSessionFactory();
			session = sessionFactroy.openSession();
			String hqlQuery = "From Employee  where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			Object object = query.getSingleResult();
			System.out.println("Employee entity: " + object);
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}

	}

	public List<Employee> getAllEmployeeEntity() {
		System.out.println("involked getEmployeeDetailsEnity()");
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			String hqlQuery = "From Employee";
			Query query = session.createQuery(hqlQuery);
			List<Employee> list = query.list();
			System.out.println("List of employee: " + list);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}
		return null;

	}

	@Override
	public void updateEmployeeDesignationById(int id, String designation) {
		System.out.println("EmployeeDaoImpl.updateEmployeeDesignationById()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "update Employee set designation=:DESIGNATION where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("DESIGNATION", designation);
			query.setParameter("ID", id);

			int noOfRowsAfftected = query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("noOfRowsAffetced:" + noOfRowsAfftected);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			SessionFactoryProvider.CloseSessionFactory();

			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,");
			}
		}

	}

	@Override
	public void updateEmployeeEntity(Employee employee) {
		System.out.println("EmployeeDaoImpl.updateEmployeeEntity()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "update Employee set name=:NAME,salary=:SALARY,designation=:DESIGNATION,"
					+ "cantact_number=:CANTACT_NUMBER,is_trained=:IS_TRAINED where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("NAME", employee.getName());
			query.setParameter("SALARY", employee.getSalary());
			query.setParameter("DESIGNATION", employee.getDesignation());
			query.setParameter("CANTACT_NUMBER", employee.getCantact_number());
			query.setParameter("IS_TRAINED", employee.isIs_Trained());
			query.setParameter("ID", employee.getId());
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Data is updated sucessfully,,,,,,,,,,,,,,");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());

		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}

	}

	@Override
	public void deleteEmployeeEntity(int id) {
		System.out.println("EmployeeDaoImpl.deleteEmployeeEntity()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "delete from Employee where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Data is deleted sucessfuully,,,,,,,");
			
			

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
//			session.getTransaction().rollback();
		}

		finally {
			
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,,,,,,,");
			}
			SessionFactoryProvider.CloseSessionFactory();
		}
	}
}
