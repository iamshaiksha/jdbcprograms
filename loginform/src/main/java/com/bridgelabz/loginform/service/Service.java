/**
 * 
 */
package com.bridgelabz.loginform.service;

/**
 * @author shaik shaiksha vali
 *
 */
public interface Service {
	
	String login(String email,String password);
	int registration(String firstName,String lastName,String email,String password,String confirmPassword,String mobileNumber,String gender);
}
