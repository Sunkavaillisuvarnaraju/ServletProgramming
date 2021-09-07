package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageEligibility extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*create printWriter object
		PrintWriter pw=res.getWriter();
		
		//set content Type
		res.setContentType("text/html");
		
		//gather values from end user
		String name=req.getParameter("pname");
		String adrss=req.getParameter("paddrs");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("gender");
		
		//Write B.logic
		if(gender.equalsIgnoreCase("M")) {
			if(age<21)
			pw.println("<h1 style='color:red;text-align:center>U R Not Eligible For Marriagge</h1>");
		else
			pw.println("<h1 style='color:red;text-align:center>U R  Eligible For Marriagge</h1>");
		}
		else {
			if(age<18)
			pw.println("<h1 style='color:red;text-align:center>U R  Eligible Not For Marriagge</h1>");
		else
			pw.println("<h1 style='color:red;text-align:center>U R  Eligible For Marriagge</h1>");
		}
		pw.println("<br> <a href='marriage_eligible.html'> home</a>");
	pw.close();
	*/
		
		
		  System.out.println("MarriageServlet.processPost(-,-)");
			// set response content type
			res.setContentType("text/html");
			//get PrintWriter 
			PrintWriter pw=res.getWriter();
			//read form data (req param values)
			String name=req.getParameter("Pname");
			int age=Integer.parseInt(req.getParameter("page"));
			String gender=req.getParameter("gender");
			//write b.logic or request processing logic
			pw.println("<h1 style='color:maroon;text-align:center'> Shaadi.com (Marriage Breuro) </h1>");
			
			if(gender.equalsIgnoreCase("M")) {
				 if(age<21)
					  pw.println("<h1 style='color:red;text-align:center'> Mr."+name +" u r not elgible for marriage enjoy life </h1>");
				 else
					 pw.println("<h1 style='color:green;text-align:center'> Mr."+name +" u r  elgible for marriage , But think once </h1>");
			}
			else {
				 if(age<18)
					  pw.println("<h1 style='color:red;text-align:center'> Miss."+name +" u r not elgible for marriage, be happy </h1>");
				 else
					 pw.println("<h1 style='color:green;text-align:center'> Miss."+name +" u r  elgible for marriage , But think Thrice </h1>");
			}
			
			//add graphical hyperlink for home  navigation
			pw.println("<br> <a href='marriage_eligible.html'><img src='images/home.png' width='50' height='50'> <br>Home</a>");
			//close stream 
			pw.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//get

}//class
