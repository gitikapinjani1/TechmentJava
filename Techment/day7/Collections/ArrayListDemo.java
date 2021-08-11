package com.Techment.day7.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		System.out.println("size before adding elements is "+obj.size() );
		obj.add(1);
		obj.add(45.65);
		obj.add("hello");
		System.out.println("size after adding elements is "+obj.size());
		
		System.out.println("element in the list "+obj);
		
		obj.add(1, "hello");
		System.out.println("element in list after adding 1st index is "+obj);
		
		obj.remove(1);
		System.out.println("element in the list after removing "+ obj);
		System.out.println("element at 2nd index: "+obj.get(2));
		
		
	}

}
