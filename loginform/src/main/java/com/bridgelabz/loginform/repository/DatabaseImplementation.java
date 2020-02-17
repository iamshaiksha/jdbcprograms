/**
 * 
 */
package com.bridgelabz.loginform.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.loginform.model.Soldiers;
import com.bridgelabz.loginform.utils.Utility;

/**
 * @author shaik shaiksha vali
 *
 */
public class DatabaseImplementation  implements DatabaseService{


	@Override
	public String dblogin(String email, String password) {
		String name=null;
		String query="select * from mydatabase.army where emailId=? and password=?";
		Connection connection=Utility.dbConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet resulSet=preparedStatement.executeQuery();

			if(resulSet.next())
			{
				name=resulSet.getString(1);
			}


		} catch (SQLException e) {
			System.out.println("invalid details");
			e.printStackTrace();
		}
		return name;



	}

	public int dbRegistration(String firstName, String lastName, String email, String password,
			String confirmPassword, String mobileNumber, String gender) {
		int result=0;
		//String mb = String.valueOf(mobileNumber);
		String query="insert into mydatabase.army values(?,?,?,?,?,?,?)";

		Connection connection=Utility.dbConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, confirmPassword);
			preparedStatement.setString(6, mobileNumber);
			preparedStatement.setString(7, gender);
			result=preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("result:"+result);
		return result;
	}

	@Override
	public List<Soldiers> getRecords(int start, int total) {
		List<Soldiers> list=new ArrayList<>();
		Connection connection=Utility.dbConnection();
		try {
			PreparedStatement prepareStatement=connection.prepareStatement("select * from mydatabase.army limit "+(start-1)+","+total);
		ResultSet resultSet=prepareStatement.executeQuery();
		while(resultSet.next())
		{
			Soldiers soldier=new Soldiers();
			soldier.setFirstName(resultSet.getString(1));
			soldier.setLastName(resultSet.getString(2));
			soldier.setEmailId(resultSet.getString(3));
			soldier.setPassword(resultSet.getString(4));
			soldier.setConfirmPassword(resultSet.getString(5));
			soldier.setMobileNumber(resultSet.getString(6));
			soldier.setGender(resultSet.getString(7));
			list.add(soldier);
		}
		connection.close();
		} catch (SQLException e) {

			
			
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}

}
