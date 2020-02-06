package com.bridgelabz.jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class CallableStatement1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String ref= "{call mydatabase.third3(?)}";
		Scanner scan=new Scanner(System.in);
		try {
			Connection connection=DriverManager.getConnection(url);
		    CallableStatement cal =connection.prepareCall(ref);
			cal.setString(1, scan.next());
			ResultSet resultSet=cal.executeQuery();
			while(resultSet.next())
			{
				String id=resultSet.getString("id");
				String name=resultSet.getString("name");
				String department=resultSet.getString("department");
				System.out.println("id="+id+"\nname="+name+"\ndepartment="+department);
				
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
