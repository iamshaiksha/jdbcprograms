package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author shaik shaiksha vali
 *
 */
public class Employee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from mydatabase.employee";
		try {
			Connection connection=DriverManager.getConnection(url);
			//System.out.println("connection established");
			Statement statement=connection.createStatement();
			//System.out.println("******paltform--Statement created****");
			ResultSet resultSet=statement.executeQuery(query);
			resultSet.next();
			
		String id	=resultSet.getString("id");
		String name	=resultSet.getString("name");
		String department	=resultSet.getString("department");
		System.out.println("id="+id+"\n"+"name="+name+"\n"+"deaprtment="+department);
			connection.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
