package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeImpl implements EmployeeDAO {

	@Override
	public void saveData() {
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

	@Override
	public void updateData() {
		String url="jdbc:mysql://localhost:3306/infoysis";
		String userName="root";
		String password="devoloper";
		Connection connection=null;
		String updateQuery="update employee set salary =80000 where id=1";
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessfull: "+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Data is updated sucessfully,,,,,,,,,");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(connection!=null) {
				System.out.println("connection is closed,,,,,,,,,,,");
//				connection.close();
			}
			else {
				System.out.println("connection is not closed,,,,,,,,,,,,,");
			}
		}
	}




	@Override
	public void readAllData() {
		String url = "jdbc:mysql://localhost:3306/infoysis";
		String userName = "root";
		String password = "devoloper";
		Connection connection = null;
		String readDataById = "select * from employee";

		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessfull: " + url);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readDataById);
			while (resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt(1));
				System.out.println("Name: " + resultSet.getString(2));
				System.out.println("Designation: " + resultSet.getString(3));
				System.out.println("Salary: " + resultSet.getInt(4));
				System.out.println("Cantact Number: " + resultSet.getLong(5));
				System.out.println("is_trained: " + resultSet.getBoolean(6));
				System.out.println("***************************************");

			}
			System.out.println("All data readed sucessfully,,,,,,,,,,,,,,,");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (connection != null) {
				System.out.println("connection is closed,,,,,,,,,,");

			} else {
				System.out.println("connection is nopt closed,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void readDataById() {
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

	

	@Override
	public void deleteData() {
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


