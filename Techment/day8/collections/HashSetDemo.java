package com.Techment.day8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(6);
		hs.add(6);
		hs.add(70);
		hs.add(11);
		hs.add(26);
		
		System.out.println("hashset "+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(1);
		lhs.add(6);
		lhs.add(6);
		lhs.add(70);
		lhs.add(11);
		lhs.add(26);
		
		System.out.println("LinkedHashSet "+ lhs);
		
		TreeSet ts =new TreeSet();
		
		ts.add(1);
		ts.add(6);
		ts.add(6);
		ts.add(70);
		ts.add(11);
		ts.add(26);
		
		System.out.println("TreeSet "+ts);
		
		
		
		
		
		
		
		
		
	}

}

//comparable interface
//------------------------
//this interface is used to compare two objects,it is helpful for sorting purpose.
//
//
//wrapper class
//----------------
//integer
//character
//byte
//sort
//double
//float
//
//String
//by default in java all the wrapper class and string class implements comparable




