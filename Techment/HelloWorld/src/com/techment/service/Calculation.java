package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		pw.print("<br>=====Calculation====<br><br>");
		
		
		String whichCalculation=request.getParameter("calculation");
		if(whichCalculation.equalsIgnoreCase("Add")) {
			
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			int add=num1+num2;
			pw.print("Addition of Two Numbers are "+ add);
		}
		
		else if(whichCalculation.equalsIgnoreCase("Sub"))
		{
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			int sub=num1-num2;
			pw.print("Substraction of Two Numbers are "+ sub);
		}
		
		else if(whichCalculation.equalsIgnoreCase("Mul"))
		{
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			int mul=num1*num2;
			pw.print("Multiplication of Two Numbers are "+ mul);
		}
		
		else if(whichCalculation.equalsIgnoreCase("Div"))
		{
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			int div=num1/num2;
			pw.print("Division of Two Numbers are "+ div);
		}
	}

}
