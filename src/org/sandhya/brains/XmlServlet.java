package org.sandhya.brains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       String username=request.getParameter("userName");
       out.println("Hello from the GET method"+username);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	       String username=request.getParameter("userName");
	       String fullName=request.getParameter("fullName");
	       out.println("Hello from the POST method:"+username+"we know your full name is:"+fullName);
	       String prof=request.getParameter("prof");
	       out.println("you are a:"+prof);
	       //String location=request.getParameter("location");
	       String[] location=request.getParameterValues("location");
	       out.println("you are a:"+location.length+"places");
	       for(int i=0;i<location.length;i++)
	       {
	       out.println(location[i]);
		}
	}
}
