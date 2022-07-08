package com.provider.connctionprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	private static Connection connection = null;
	static {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infoysis", "root", "devoloper");
			System.out.println("Connection is sucessfull,,,,,,");
			System.out.println("Connection is singleton,,,,,,,,,,,,,");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			System.out.println("connection is not closed,,,,,,,,,,");
			return connection;
		}

	}

	public static void closeConnection() {
		if (connection != null) {
			System.out.println("connection is closed,,,,,,,,,,");
		} else {
			System.out.println("Connection is not closed,,,,,,,,,,,,,,,,,");
		}
	}
}
