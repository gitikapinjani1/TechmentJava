package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MobilePrice
 */
@WebServlet("/MobilePrice")
public class MobilePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter pw=response.getWriter();
		
		int price=40000;
		int quantity=Integer.parseInt(request.getParameter("phone"));
		pw.print("You have seleted "+quantity);
		
		double totalPrice=quantity*price;
		pw.println("Total price = "+totalPrice);
		
		pw.print("<a href='Cart'>go to cart</a>");
		
		
		//String totprice = String.copyValueOf(totalprice);
		Cookie cookie=new Cookie("laptopprice", String.valueOf(totalPrice));
		response.addCookie(cookie);
			
	}

}
