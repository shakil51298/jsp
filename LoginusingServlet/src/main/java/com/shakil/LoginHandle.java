package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginHandle extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		if (uname.equals("shakil") && pass.equals("12345")) {
			
			HttpSession session = req.getSession() ; 
			session.setAttribute("username", uname);
             //redirect to the welcome page
			res.sendRedirect("Welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
	}

}
