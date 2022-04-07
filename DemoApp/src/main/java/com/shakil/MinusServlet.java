package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/minus")
public class MinusServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1")) ; 
		int j = Integer.parseInt(req.getParameter("num2")) ; 
		int k = i - j ; 
//		redirect using sendRedirect to Division Servlet
			res.sendRedirect("dv?k=" + k); // URL Rewritting ; 
		
//		PrintWriter pr = res.getWriter();
//		pr.println("the minus result is: " + k);
	}
}
