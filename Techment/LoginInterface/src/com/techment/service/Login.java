package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class is found");
		
		//step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?autoReconnect=true&useSSL=false","root","Vaibhav123@");
		System.out.println("conected");
		
		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		
		PrintWriter out=response.getWriter();		
		out.print(username);
		out.print(password);
		
		
		   Statement stmt=con.createStatement();
	    	PreparedStatement ps=con.prepareStatement(" Select * from login.login where userName = ? AND password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				out.print("Login Successfully");
			}
			
			else {
				out.print("Login Details not available , please Register yourself <br><a href='Resister.html'>Register</a>");
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	}

