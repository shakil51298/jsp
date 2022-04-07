package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Home")
public class HomePractice extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i , j , k ; 
		i = 5 ; 
		j = 20 ; 
		k = i + j ;
		PrintWriter out = resp.getWriter() ; 
		out.print("<html> <body bgcolor='cyan'>");
		out.println("Output is:" + k);
		out.print("</body></html>");
	}
}
