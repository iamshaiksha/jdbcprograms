package com.bridgelabz.loginform.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginform.service.ServiceImplementation;
@WebServlet("/view/Login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("pass");

		ServiceImplementation serviceImplementation=new ServiceImplementation();
		String name=serviceImplementation.login(email, password);
		System.out.println(name+"=name");
		PrintWriter pw= resp.getWriter();
		if(name.equalsIgnoreCase("shaik"))
		{	


			// here it will get the old session and ivalidate
			HttpSession oldSession=req.getSession(false);
			
			if(oldSession!=null)
			{
				oldSession.invalidate();
			}
			//generating a new session
			HttpSession newSession=req.getSession(true);
			newSession.setMaxInactiveInterval(20);
		
		/**we can use setHeader for refreshning the page for every 10 secs here it will expire the session
			it can be done by filter also or else i had declared here
			resp.setHeader("Refresh", 10+"; ErrorPage.jsp"); 
			
			req.getRequestDispatcher("LoginSuccess.jsp").include(req, resp);
			*/
			pw.println("Login successfully");
			//when ever i am login it will display name and now cookie is creating 
			req.getRequestDispatcher("common.html").include(req, resp);
			Cookie cookie=new Cookie("emailId",email);
			resp.addCookie(cookie);
		}else
		{
			req.getRequestDispatcher("Login.html").include(req, resp);
			pw.println("incorrect details....plz login again");

			//req.getRequestDispatcher("index.html").include(req, resp);

		}


	}
}
