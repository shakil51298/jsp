package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//xml annoataion
@WebServlet("/Sq")
public class SqServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// fetching data from Coockie ; 
		int k = 0 ; 
		Cookie cookies[] = req.getCookies() ; 
		for(Cookie c : cookies ) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());			
			}
		}
		
//		fetching data from HttpSession getAttribute ; 
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k") ; 
		// fetching data from getAttributr;
//		int k = (int) (req.getAttribute("k"));
		k = k * k ;
		
		PrintWriter pr = res.getWriter();
		
		pr.println("The Result of Square is : " + k);
	}
}
