package com.projectsessionfactoryprovider;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {

		System.out.println("involked getSessionFactory()");
		if (Objects.nonNull(sessionFactory)) {
			return sessionFactory;

		} else {
			System.out.println("Session factory is not created,,,,,,,,,,,");
			return sessionFactory;
		}

	}

	public static void CloseSessionFactory() {
		if (sessionFactory != null) {
			System.out.println("Session factory is closed,,,,,,,,,,,");
			sessionFactory.close();
		} else {
			System.out.println("Session factory is not closed,,,,,,,,,,,");
		}
	}

}
