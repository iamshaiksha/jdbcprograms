package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="update mydatabase.employee set id=? where name=?";
		try {
			Connection con=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter id");
			preparedStatement.setString(1, scan.next());
			System.out.println("Enter name");
			preparedStatement.setString(2, scan.next());
			preparedStatement.executeUpdate();
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
