/**
 * 
 */
package com.bridgelabz.loginform.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shaik shaiksha vali
 *
 */
public class Utility {

	private static Connection connection;
	
	
	static {

		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url);
			System.out.println("connection...");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public static Connection dbConnection()
	{
		System.out.println("conn..");
		return connection;
		
	}
}
