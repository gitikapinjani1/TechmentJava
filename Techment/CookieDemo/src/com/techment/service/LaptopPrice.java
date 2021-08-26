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
 * Servlet implementation class LaptopPrice
 */
@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int price=70000;
		int quantity=Integer.parseInt(request.getParameter("laptop"));
		pw.print("You have seleted "+quantity);
		
		double totalPrice=quantity*price;
		pw.println("Total price = "+totalPrice);
		
		pw.print("<a href='Cart'>go to cart</a>");
		
		//String totprice = String.copyValueOf(totalprice);
		Cookie cookie=new Cookie("laptopprice", String.valueOf(totalPrice));
		response.addCookie(cookie);
		
		
	
	}

}
