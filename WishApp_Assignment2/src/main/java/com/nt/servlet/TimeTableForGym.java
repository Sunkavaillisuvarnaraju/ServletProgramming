package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeTableForGym extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	//create Printstream Object
	PrintWriter pw=res.getWriter();
	//set content Type
	res.setContentType("text/html");
	//get The Date and Time
	LocalDateTime ldt=LocalDateTime.now();
	int hour=ldt.getHour();
	pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
	if(hour<8)
		pw.println("<h1 style='color:red;text-align:center'>Gym Time</h1>");
	else if(hour<16)
		pw.println("<h1 style='color:red;text-align:center'>Rest Time</h1> ");
	else
		pw.println("<h1 style='color:red;text-align:center'>Working Time</h1>");
	
	//close the Stream
	pw.close();
	
     }//service

}//class
	
		
	


	
	
	
