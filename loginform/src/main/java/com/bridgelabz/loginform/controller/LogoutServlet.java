package com.bridgelabz.loginform.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view/LogoutServlet")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw=resp.getWriter();
		Cookie cookie=new Cookie("emailID","");
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
		pw.println("Logged Out Succefully....!");
	
	}
	
}
