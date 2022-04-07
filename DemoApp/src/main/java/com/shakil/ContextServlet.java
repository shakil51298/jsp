package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		Access the data from Context Servlet which Declared in web.xml file
		
		PrintWriter print = res.getWriter();
		print.print("hi " );
		
		ServletContext ctx = req.getServletContext();
		String str = ctx.getInitParameter("Phone");
		print.println(str);
		
		ServletConfig cg = getServletConfig();
		String st = cg.getInitParameter("name");
		print.print(st);
		
	}
}
