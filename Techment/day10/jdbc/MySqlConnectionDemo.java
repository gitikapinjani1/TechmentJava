package com.Techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		try{
			
			//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class is found");
		
		//step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","Vaibhav123@");
		System.out.println("conected");
		
		//step3
		Statement stmt=con.createStatement();
		stmt.execute("insert into employee values(2,'sachin', 34000)");
		System.out.println("inserted");
		
		ResultSet rs =stmt.executeQuery("select * from employee");
		
		while(rs.next()){
			System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getInt(3));
		}
		
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
