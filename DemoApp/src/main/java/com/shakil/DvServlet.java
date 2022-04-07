package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/dv")
public class DvServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
//		fetching the data from url sendRedirect ; 
		int k = Integer.parseInt(req.getParameter("k"));
		double percantage =  (k * .10) ; 
		
		PrintWriter pr = res.getWriter();
		pr.println("printing from Division servlet:"+ percantage);
		
		// access data using servletConfig which declared in web.xml page for Div servlet;
		ServletConfig cg = getServletConfig();
		String st = cg.getInitParameter("name");
		pr.print(st);
	}
}
