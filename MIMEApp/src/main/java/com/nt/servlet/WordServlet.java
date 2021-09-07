//WordServlet
package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WordServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
	//Set ContentType
	res.setContentType("application/msword");
	//get PrinWriter Object
	PrintWriter pw =res.getWriter();
	//Write output To Browser
	pw.println("<table border ='1' align='center'>");
	pw.println("<tr><th>PlayerName</th><th>Medals</th><th>Category</th></tr>");
	pw.println("<tr><td>Neeraj Chopra</td><td>Gold</td><td>Javaline Throw</td></tr>");
    pw.println("<tr><td>Meera Bhai chanu </td><td>Silver</td><td>Weight Lifting</td></tr>");
	pw.println("<tr><td>RaviKumar Dhahiya</td><td> Silver</td><td>Wrestling</td></tr>");
	pw.println("<tr><td>PV Sindhu</td><td>Bronze</td><td>Batminton</td></tr>");
	pw.println("<tr><td>Lovina</td><td>Bronze</td><td>Boxing</td></tr>");
	pw.println("<tr><td>Hoky</td><td>Bronze</td><td>Mens Hocky</td></tr>");
	pw.println("<tr><td>Bajarang</td><td>Bronze</td><td>Boxing</td></tr>");
  //close Stream
  pw.close();
 
 }//Service

}//class

