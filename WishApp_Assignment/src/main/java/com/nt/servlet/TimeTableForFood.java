package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeTableForFood extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	//create PrintStream Object
	PrintWriter pw=res.getWriter();
	//set contentType
	res.setContentType("text/html");
	//Write BLogic
	LocalDateTime ldt=LocalDateTime.now();//gets Current Time
	int hour=ldt.getHour();//gives 0 to 23 hours
	pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
	
	if(hour<10) 
		pw.println("<h1 style='color:red;text-align:center'>Break Fast Time</h1>");
	else if(hour<13)
		pw.println("<h1 style='color:red;text-align:center'>Lunch Time</h1>");
	else if(hour<16)
		pw.println("<h1 style='color:red;text-align:center'>Sleeping Time</h1>");
	else 
		pw.println("<h1 style='color:red;text-align:center'>Dinner Time</h1>");
	
	//close the Stream
	pw.close();
	
     }//service

}//class
	
		
	


	
	
	
