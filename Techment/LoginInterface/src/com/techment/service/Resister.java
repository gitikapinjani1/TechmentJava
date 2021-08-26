package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resister
 */
@WebServlet("/Resister")
public class Resister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		PrintWriter out=response.getWriter();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class is found");
		
		//step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?autoReconnect=true&useSSL=false","root","Vaibhav123@");
		System.out.println("conected");
		
		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		out.print(username);
		out.print(password);
		
		
		   Statement stmt=con.createStatement();
		   PreparedStatement ps=con.prepareStatement("insert into login values(?,?)");
		  
		   ps.setString(1, username);
		   ps.setString(2, password);
		   
		   int i=ps.executeUpdate();
		   if(i>0)
			   out.print("Registered Successfully");
		   else
			   out.print("not Registered");
		   
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

}
