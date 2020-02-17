/**
 * 
 */
package com.bridgelabz.loginform.repository;

import java.util.List;

import com.bridgelabz.loginform.model.Soldiers;

/**
 * @author shaik shaiksha vali
 *
 */
public interface DatabaseService {
 String dblogin(String email,String password);
 int dbRegistration(String firstName, String lastName, String email, String password, String confirmPassword,
			String mobileNumber, String gender);
 public List<Soldiers> getRecords(int start,int total);
}
