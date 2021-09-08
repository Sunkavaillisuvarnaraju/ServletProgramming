package com.nt.servlet.GetCapitalServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCapitalServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Create PrintStream Object
		PrintWriter pw=res.getWriter();
		//Set content type
		res.setContentType("text/html");
		//collect the data from the user
		int country=Integer.parseInt(req.getParameter("country"));
		//get Capital City names
		String capitals[]=new String[] {"New Delhi","Islamabad","WashingTon DC","Beijing"};
		String countries[]=new String[] {"India","Pakistan","USA","China"};
		pw.println("<h1 style='color:red;text-align:center'>Capital Name of the Country "+countries[country]+" is ::"+capitals[country]+"</h1>");
		//add HomeHyper link
		pw.println("<a href='page.html>Home</a>");
		//close the PrintStream
		pw.close();
		
	
	}
 @Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 				doGet(req,res);
 }
}
