package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccineEligibilityCheckServlet extends HttpServlet {
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			//create printWriter
			PrintWriter pw=res.getWriter();
			//setContent Type
			res.setContentType("text/html");
			//Gather the Values from Request URl
			String name=req.getParameter("pname");
			int age=Integer.parseInt(req.getParameter("page"));
			String address=req.getParameter("paddrs");
			//Business Logic
		if(age<18)
		pw.println("<h1 style='color:red;text-align:center'>Mr/Miss/Mirss "+name+" You are not eligible for Corona Vaccination</h1>");
		else
			pw.println("<h1 style='color:red;text-align:center'>Mr/Miss/Mirss "+name+" You are  eligible for Corona Vaccination</h1>");
			
			pw.println("<a href='http://localhost:3030/HTMLToServletUsingForms/corona_vaccine.html'><img src='images/home.png'></a>");
			
			
			
			
		}
	
	
}
