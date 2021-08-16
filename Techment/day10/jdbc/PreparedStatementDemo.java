package com.Techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is found");
			
			//step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","Vaibhav123@");
			System.out.println("conected");
			
			
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			for(int i=0;i<3;i++){
				System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println("enter name");
			String name=scanner.next();
			System.out.println("enter salary");
			int salary = scanner.nextInt();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			}
			
			ps.execute();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
