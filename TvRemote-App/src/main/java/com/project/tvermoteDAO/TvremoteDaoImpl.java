package com.project.tvermoteDAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.TvRemote;

@Component
public class TvremoteDaoImpl implements TvRemoteDAO {
	@Autowired
	private SessionFactory sessionFactroy;

	public TvremoteDaoImpl() {
		System.out.println("TvRemoteDaoImpl object is created: " + this.getClass().getName());
	}

	@Override
	public void saveTvRemoteEntity(TvRemote tvRemote) {
		System.out.println("involked save TvRemoteEntity()");
		Session session = null;
		try {
			session = sessionFactroy.openSession();
			session.beginTransaction();
			session.save(tvRemote);
			session.getTransaction().commit();
			System.out.println("Tve Remote Entity is saved sucessfully,,,,,,,,,,,,,");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,");
			}
		}

	}

	@Override
	public void getTvRemoteEntityById(int id) {
		System.out.println("involked getTvRemoteEnitytById");
		Session session = null;
		try {
			session = sessionFactroy.openSession();
			session.beginTransaction();
			String hqlQuery = "from com.project.entity.TvRemote where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			Object obj = query.getSingleResult();
			System.out.println("TvRemote Enitiy: " + obj);
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void readAllEntity() {
		System.out.println("TvremoteDaoImpl.readAllEntity()");
		Session session = null;

		try {
			session = sessionFactroy.openSession();
			session.beginTransaction();
			String hqlQuery = "From com.project.entity.TvRemote";
			Query query = session.createQuery(hqlQuery);
			List<TvRemote> list = query.list();
			System.out.println("All Entity Data: " + list);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,");
			}
		}

	}

	@Override
	public void deleteTvRemoteEntity(int id) {
		System.out.println("TvremoteDaoImpl.deleteTvRemoteEntity()");
		Session session = null;
		try {
			session = sessionFactroy.openSession();

			String hqlQuery = "From com.project.entity.TvRemote where id=:ID";
			Query query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			Object obj = query.uniqueResult();
			session.beginTransaction();
			session.delete(obj);
			session.getTransaction().commit();
			System.out.println("Data is deleted sucessfully,,,,,,,,,,");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,,,,,,,,");
			}
		}

	}

}
