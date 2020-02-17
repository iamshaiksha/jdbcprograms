/**
 * 
 */
package com.bridgelabz.loginform.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginform.service.ServiceImplementation;

/**
 * @author Shaik.shaiksha vali
 *
 */
@WebServlet("/view/Register")
public class RegistrationServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String firstName=req.getParameter("fname");
	String lastName=req.getParameter("lname");
	String email=req.getParameter("email");
	String password=req.getParameter("pass");
	String confirmPassword=req.getParameter("cpass");
	String mobileNumber=req.getParameter("mobile");
	String gender=req.getParameter("gender");
	ServiceImplementation serviceImplementation=new ServiceImplementation();
	 int result=serviceImplementation.registration(firstName, lastName,email,password,confirmPassword,mobileNumber,gender);
	 PrintWriter pw=resp.getWriter();
	 pw.print("welcome");
	}
	
}
