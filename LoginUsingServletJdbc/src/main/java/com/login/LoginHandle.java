package com.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("loginHandle")
public class LoginHandle extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		if(username.equals("shakil") && password.equals("12345")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			res.sendRedirect("welcome.jsp");
		}
		else {
			req.getRequestDispatcher("login.jsp");
		}
		
	}

}
