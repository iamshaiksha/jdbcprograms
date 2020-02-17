/**
 * 
 */
package com.bridgelabz.loginform.model;

/**
 * @author user
 *
 */
public class Soldiers {
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String confirmPassword;
	private String MobileNumber;
	private String gender;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return MobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Soldiers [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", MobileNumber=" + MobileNumber + ", gender="
				+ gender + "]";
	}


}
