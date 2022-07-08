package com.project.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/infoysis";
		String userName="root";
		String password="devoloper";
		Connection connection=null;
		String insertQuery="insert into employee value(4,'Raghu','Senier devoloper',50000,986576644,true)";
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data is inserted sucessfully,,,,,,,,,");
		}
		catch(SQLException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			if(connection!=null) {
				System.out.println("connection is closed,,,,,,,,,,,,");
			}
			else {
				System.out.println("Connection is not closed,,,,,,,,,,");
			}
		}
	}

}
