package com.project.newspaperDao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dto.NewspaperDto;
import com.project.entity.Newspaper;
@Component
public class NewspaperDaoImpl implements NewspaperDao {
	public NewspaperDaoImpl() {
		System.out.println("Object is created: "+this.getClass().getName());
	}
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveNewspaperEntity(Newspaper newspaper) {
		System.out.println("involked saveNewspaperEntity()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(newspaper);
			session.getTransaction().commit();
			System.out.println("data is saved sucessfully,,,,,,,,,,,,,");
			return true;
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,,");
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,,,");
			}
		}
		return false;
	}

	@Override
	public Newspaper getNewspaperEntity(String newspaperName) {
		System.out.println("involked getNewspaperEntity()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			Query query=session.createNamedQuery("Newspaper.getNewspaperObject");
			query.setParameter("name", newspaperName);
			Newspaper newspaper=(Newspaper) query.getSingleResult();
			if(newspaper!=null) {
				return newspaper;
			}
			else {
				System.out.println("Newspaper Name is not found,,,,,,,,,,,,");
				return null;
			}
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
				System.out.println("Session is not closed,,,,,,,,,,,,");
			}
		}
		return null;
	}

	@Override
	public List<Newspaper> getAllNewspaperEntity() {
		System.out.println("involked getAllNewspaperEntity()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			Query<Newspaper> query=session.createNamedQuery("Newspaper.getAllEntity");
			List<Newspaper> list=query.list();
			if(list!=null && !list.isEmpty()) {
				return list;
			}
			else {
				System.out.println("list is empty,,,add some data,,,,,,,");
			}
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
				System.out.println("session is not closed,,,,,,,,,,,");
			}
		}
		return null;
	}

	@Override
	public boolean deleteNewspaperEntity(String newspaperName) {
		System.out.println("involked delete Newspaper Entity()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			Query query=session.createNamedQuery("deleteNewspaperEntity");
			query.setParameter("name", newspaperName);
			Newspaper object=(Newspaper) query.uniqueResult();
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
			System.out.println("Newspaper Entity is deleted,,,,,,,,,,");
			return true;
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,,,,");
			}
		}
		return false;
	}

	@Override
	public List<Newspaper> getNewspaperEntityByName(String newspaperName) {
		System.out.println("NewspaperDaoImpl.getNewspaperEntityByName()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			Query query=session.createNamedQuery("Newspaper.getNewspaperObject");
			query.setParameter("name", newspaperName);
			List<Newspaper> newspaperEntity=query.list();
			if(newspaperEntity!=null) {
				return newspaperEntity;
			}
			else {
				System.out.println("newspaper not found,,,,,,,,,,");
				return null;
			}
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(session!=null) {
				System.out.println("session is closed,,,,,,");
				session.close();
			}
			else {
				System.out.println("session is not closed,,,,,,,,,,,,,");
			}
		}
		
		return null;
	}

	@Override
	public boolean updateNewspaperEntity(NewspaperDto newspaperDto) {
		System.out.println("NewspaperDaoImpl.updateNewspaperEntity()");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			Query query=session.createNamedQuery("updateNewspaperEntity");
			query.setParameter("Name", newspaperDto.getNewspaperName());
			query.setParameter("Price", newspaperDto.getPrice());
			query.setParameter("Language", newspaperDto.getLanguage());
			query.setParameter("NoOfPages", newspaperDto.getNoOfPages());
			int updated=query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Data is updated sucessfully,,,,,,,,,,,");
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		finally {
			if(session!=null) {
				System.out.println("Session is closed,,,,");
			}
			else {
				System.out.println("session is not closed,,,,,,,,,");
			}
		}
		return false;
	}

}
