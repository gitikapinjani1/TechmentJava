package com.Techment.day7.Collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	 ArrayList <Integer> o1=new ArrayList<Integer>();
	 o1.add(1);
	 o1.add(2);
	 o1.add(3);
	 o1.add(4);
	 o1.add(5);
	 
	 System.out.println(" elements of o1 are "+o1);
	 
	 ArrayList <Integer> o2=new ArrayList<Integer>();
	 o2.add(100);
	 o2.add(200);
	 o2.add(300);
	 o2.add(400);
	 o2.add(5);
	 
	 System.out.println(" elements of o2 are "+o2);
	 
	 o2.retainAll(o1);
	 
	 System.out.println(" After reatin o1 in o2   "+o2);
	 
	 
	 
	 
	 
		
	}

}
