package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//set content to browser
		res.setContentType("text/html");
		//Create printWriter objcect
		PrintWriter pw =res.getWriter();
		//create Date Class objcet
		Date dt= new Date();
		//Write Generated output to Response object
		pw.println("<h1 style='color:red;text-align:center'> Date and Time is ::"+dt+" </h1>");
		
		//close the PrintWriter Object
		pw.close();

	}

}
