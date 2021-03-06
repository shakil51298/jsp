package com.shakil;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/FirstServlet")

public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "Shakil Khan";
		// set name as attribute
		
		// calling constructor which i declare in Students.java file
//		Studnts st = new Studnts("Shakil Khan" , 45 , "18579191038") ; 
		List<Studnts> stds = Arrays.asList(new Studnts("Shakil Khan" , 45 , "18579191038"), new Studnts("Rokon" , 34 , "2423453545") , new Studnts("Shakib Khan", 55, "29623789467893")) ;
		
		req.setAttribute("students", stds) ; 
		RequestDispatcher rd = req.getRequestDispatcher("/funtionTags.jsp");
		rd.forward(req, resp);
		RequestDispatcher rds = req.getRequestDispatcher("/funtionTags.jsp");
		rds.forward(req, resp);
	}
}
