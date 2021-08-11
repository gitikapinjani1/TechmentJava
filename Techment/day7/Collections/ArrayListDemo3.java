package com.Techment.day7.Collections;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList <Integer> b1=new ArrayList<Integer>();
		 b1.add(1);
		 b1.add(2);
		 b1.add(3);
		 b1.add(4);
		 b1.add(5);
		 
		 System.out.println(" elements of batch1 are "+b1);
		 
		 ArrayList <Integer> b2=new ArrayList<Integer>();
		 b2.add(100);
		 b2.add(200);
		 b2.add(300);
		 b2.add(400);
		 b2.add(5);
		 
		 System.out.println(" elements of batch2 are "+b2);
		 
		 b2.addAll(b1);
		 
		 
	}

}
