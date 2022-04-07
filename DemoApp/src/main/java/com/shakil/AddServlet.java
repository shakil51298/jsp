package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//anotation xml
@WebServlet("/add")

public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j ; 
		//System.out.println("The result of the two is:" + k); // printing in console
		
//		printing on web page ;
//		PrintWriter out = res.getWriter();
//		out.println("The result of the two is:" + k);
		
//		pass data to Sq servlet from this sevrlet;
		 // we are using conpect of Session Management ; 
//		req.setAttribute("k", k);
		
//		pass data using HttpSession
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		passing data using Coockie ; 
		
		Cookie cookie = new Cookie("k" ,k+"");
		res.addCookie(cookie);
		
//		redirect to Sq servlet 
		RequestDispatcher rd = req.getRequestDispatcher("Sq");
		rd.forward(req, res);
		
	}

}
