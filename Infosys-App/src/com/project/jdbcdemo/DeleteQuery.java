package com.project.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/infoysis";
		String userName="root";
		String password="devoloper";
		Connection connection=null;
		String deleteIQuery="delete from employee where id=4";
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessfull: "+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(deleteIQuery);
			System.out.println("Data is deleted sucessfully,,,,,,,,,,,,,");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(connection!=null) {
				System.out.println("connection is closed,,,,,,,,,,");
			}
			else {
				System.out.println("connection is not closed,,,,,,,,,,,,,,,,");
			}
		}
	}

}
