/**
 * 
 */
package com.bridgelabz.loginform.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shaik shaiksha vali
 *
 */
@WebServlet("/view/ProfileServlet")
public class ProfileServlet extends HttpServlet{

	String name=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw=resp.getWriter();
		Cookie cookie[]=req.getCookies();
		if(cookie!=null)
		{
			name=cookie[0].getValue();

			if(name!=null)
			{
				pw.println("<b>"+"welcome to profile"+"<b>");
				pw.println(name);
				req.getRequestDispatcher("common.html").include(req, resp);
			}
		}
		else
		{
			req.getRequestDispatcher("Login.html");
			pw.println("login first");

		}

	}


}
