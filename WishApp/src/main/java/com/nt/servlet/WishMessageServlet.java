package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//Create PrintWriter Object
		PrintWriter pw=res.getWriter();
		//Set content type
		res.setContentType("text/html");
		//Write Blogic to get Date Object
		LocalDateTime ldt=LocalDateTime.now();//gives current Time 
		int hour=ldt.getHour();//gives current Time 0to 23
		pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
		
		if(hour<12)
			pw.println("<h1 style='color:red;text-align:center'>Good Morning</h1>");
		
		else if(hour<16)
			pw.println("<h1 style='color:red;text-align:center'>Good AfterNoon</h1>");
		
		else if(hour<20)
			pw.println("<h1 style=color:red;text-align:center'>Good Evening</h1>");
		
		else 
			pw.println("<h1 style=color:red;test-align:center'>Good Night</h1>");
		
		//Add Home HiperLink To Web page
		pw.println("<br><a href=http://localhost:3030/WishApp/page.html>home</h1>");
		//close the stream
		pw.close();
	}//service 

}//class
