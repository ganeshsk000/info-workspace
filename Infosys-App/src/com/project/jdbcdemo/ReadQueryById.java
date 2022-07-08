package com.project.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadQueryById {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/infoysis";
		String userName="root";
		String password="devoloper";
		Connection connection=null;
		String readDataById="select * from employee where id=1";
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessfull: "+url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readDataById);
			resultSet.next();
			System.out.println("ID: "+resultSet.getInt(1));
			System.out.println("Name: "+resultSet.getString(2));
			System.out.println("Designation: "+resultSet.getString(3));
			System.out.println("Salary: "+resultSet.getInt(4));
			System.out.println("Cantact Number: "+resultSet.getLong(5));
			System.out.println("is_trained: "+resultSet.getBoolean(6));
			System.out.println("Data readed sucessfully,,,,,,,,,,,,");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			if(connection!=null) {
				System.out.println("connection is closed,,,,,,,,,,,");
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("connection is not closed,,,,,,,,,,");
			}
		}
	}

}
