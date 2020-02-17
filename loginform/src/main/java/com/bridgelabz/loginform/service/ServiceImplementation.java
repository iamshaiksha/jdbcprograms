/**
 * 
 */
package com.bridgelabz.loginform.service;

import com.bridgelabz.loginform.repository.DatabaseImplementation;

/**
 * @author shaik shaiksha vali
 *
 */
public class ServiceImplementation implements Service{

	DatabaseImplementation databaseImple=new DatabaseImplementation();
	
	@Override
	public String login(String email, String password) {
		// TODO Auto-generated method stub
		return databaseImple.dblogin(email, password);		
		
	
	}


	@Override
	public int registration(String firstName, String lastName, String email, String password, String confirmPassword,
			String mobileNumber, String gender) {
		
		
		
		
		System.out.println("service");
		return databaseImple.dbRegistration(firstName,lastName,email,password,confirmPassword,mobileNumber,gender);
	}

	
	
	
}
