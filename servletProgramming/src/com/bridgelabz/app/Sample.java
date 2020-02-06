package com.bridgelabz.app;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Sample")
public class Sample extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(format.format(date));
		
		
	}
	
	
	
}
