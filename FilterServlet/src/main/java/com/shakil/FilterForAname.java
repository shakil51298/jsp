package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;


public class FilterForAname extends HttpFilter {
       
 

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter() ; 
		
		String aname = req.getParameter("aname");
		
		if (aname.length() > 3) {
			chain.doFilter(request, response);
		}
		else {
			out.print("Invalid aname!!");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
