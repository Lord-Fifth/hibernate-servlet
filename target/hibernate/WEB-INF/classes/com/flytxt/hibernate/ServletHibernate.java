package com.flytxt.hibernate;

import java.io.*;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

// Servlet Name 
@WebServlet("/InsertData") 
public class ServletHibernate extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		try { 
			 EmployeeEntity emp = new EmployeeEntity();
		     emp.setNo(Integer.parseInt(request.getParameter("no")));
		     emp.setBdate(request.getParameter("bdate"));
		     emp.setFname(request.getParameter("fname"));
		     emp.setLname(request.getParameter("lname"));
		     emp.setGen(request.getParameter("gen"));	
		     emp.setHdate(request.getParameter("hdate"));
		        
	         EmployeeDAO dao=new EmployeeDAO();
	         int i=dao.empSave(emp);
	            
	         PrintWriter out = response.getWriter(); 
	         if(i==1) {
			
	        	 out.println("<html><body><h2>Successfully Inserted</h2></body></html>"); 
	         }
	         else {
	        	 out.println("<html><body><h2>Error Occured</h2></body></html>"); 
	         }
		}catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
