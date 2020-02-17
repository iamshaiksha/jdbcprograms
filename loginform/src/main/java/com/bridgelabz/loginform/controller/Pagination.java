/**
 * 
 */
package com.bridgelabz.loginform.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginform.model.Soldiers;
import com.bridgelabz.loginform.repository.DatabaseImplementation;

/**
 * @author shaik shaiksha vali
 *
 */
@WebServlet("/view/Pagination")
public class Pagination extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter out=resp.getWriter();
	int  pageId=Integer.parseInt(req.getParameter("page"));
	out.println("<h1>PageNo:"+pageId+"<h1>");
	int total=5;
	if(pageId==1)
	{
		
	}
	else {
		pageId=pageId-1;
		pageId=pageId*total+1;
	}
	DatabaseImplementation imple=new DatabaseImplementation();
	List<Soldiers> list=imple.getRecords(pageId, total);
	out.println("<table border='1' cellPadding='4' width='50%'>");
	out.print("<tr><th>firstName</th><th>lastName</th><th>email</th><th>password</th><th>confirmPassword</th><th>phoneNumber</th><th>gender</th></tr>");
	for (Soldiers soldier : list) {
			
		out.println("<tr><td>"+soldier.getFirstName()+"</td>"+"<td>"+soldier.getLastName()+"</td>"+"<td>"+soldier.getEmailId()+"</td>"+"<td>"+soldier.getPassword()+"</td>"+"<td>"+soldier.getConfirmPassword()+"</td>"+"<td>"+soldier.getMobileNumber()+"</td>"+"<td>"+soldier.getGender()+"</td></tr>");
	
	}
	out.print("</table>");
	out.println("<a href='Pagination?page=1'>1</a>");
	out.println("<a href='Pagination?page=2'>2</a>");
	out.println("<a href='Pagination?page=3'>3</a>");
	out.close();
	
	}
	

}
