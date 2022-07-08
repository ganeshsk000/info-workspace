package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.provider.connctionprovider.ConnectionProvider;

public class EmployeImpl implements EmployeeDAO {

	@Override
	public void saveData() {

		String insertQuery = "insert into employee value(4,'Raghu','Senier devoloper',50000,986576644,true)";

		try {
			Connection connection = ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data is inserted sucessfully,,,,,,,,,");
		} catch (SQLException e) {
			System.out.println(e.getStackTrace());
		} finally {
			ConnectionProvider.closeConnection();
		}

	}

	@Override
	public void updateData() {

		String updateQuery = "update employee set salary =80000 where id=1";

		try {
			Connection connection = ConnectionProvider.getConnection();
			System.out.println("Connection is sucessfull: ");
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Data is updated sucessfully,,,,,,,,,");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionProvider.closeConnection();
			

		}
	}

	@Override
	public void readAllData() {

		String readDataById = "select * from employee";

		try {
			Connection connection = ConnectionProvider.getConnection();
			System.out.println("Connection is sucessfull: ");
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
			ConnectionProvider.closeConnection();
		}
	}

	@Override
	public void readDataById() {

		String readDataById = "select * from employee where id=1";

		try {
			Connection connection = ConnectionProvider.getConnection();
			System.out.println("Connection is sucessfull: ");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readDataById);
			resultSet.next();
			System.out.println("ID: " + resultSet.getInt(1));
			System.out.println("Name: " + resultSet.getString(2));
			System.out.println("Designation: " + resultSet.getString(3));
			System.out.println("Salary: " + resultSet.getInt(4));
			System.out.println("Cantact Number: " + resultSet.getLong(5));
			System.out.println("is_trained: " + resultSet.getBoolean(6));
			System.out.println("Data readed sucessfully,,,,,,,,,,,,");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			ConnectionProvider.closeConnection();
		}
	}

	@Override
	public void deleteData() {

		String deleteIQuery = "delete from employee where id=4";

		try {
			Connection connection = ConnectionProvider.getConnection();
			System.out.println("Connection is sucessfull: ");
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteIQuery);
			System.out.println("Data is deleted sucessfully,,,,,,,,,,,,,");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionProvider.closeConnection();
		}

	}
}
