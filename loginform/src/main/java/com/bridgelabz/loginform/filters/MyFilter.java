package com.bridgelabz.loginform.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/*")
public class MyFilter implements Filter {
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	HttpSession session=null;
	HttpServletRequest req=null;
	}
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * here we are coverting servlet request into HttpServletRequest interface all the request and response 
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		PrintWriter out=resp.getWriter();
		HttpSession newSession=req.getSession(true);
		newSession.setMaxInactiveInterval(60);
		resp.setHeader("Refresh",60+";URL=ErrorPage.jsp" );
		req.getRequestDispatcher("LoginSuccess.jsp").include(req, resp);
		chain.doFilter(request, response);
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

}
