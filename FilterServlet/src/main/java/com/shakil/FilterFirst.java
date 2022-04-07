package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/addAlien")
public class FilterFirst extends HttpFilter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request; // type casting;
		int aid = Integer.parseInt(req.getParameter("aid"));
		String aname = req.getParameter("aname");
		if (aid > 1) {
			chain.doFilter(request, response);
		} else {
			out.print("invalid aid!!");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
