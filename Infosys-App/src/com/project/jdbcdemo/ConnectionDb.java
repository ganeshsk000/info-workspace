package com.project.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/infoysis";
		String userName="root";
		String password="devoloper";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is established: "+url);
		}
		catch(SQLException e) {
			System.out.println("Connection is closed,,,,,,,,,,,,,");
		}
		finally {
			connection.close();
			System.out.println("Connection is closed,,,,,,,,,,,,");
		}
	}
	

}

