package com.Techment.day7.Collections;

import java.util.ArrayList;
import java.util.Iterator;

//it is an interface
//it has two methods
//		hasNext();
//		next();
//it will go in forward direction
		
public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1 =new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		System.out.println("elements of o1 "+o1);
		
		Iterator<Integer> itr=o1.iterator();
		while(itr.hasNext()){
			System.out.println(o1.next());
		}
		
	}

}
