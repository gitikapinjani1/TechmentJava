package com.Techment.day7.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//it is an interface
//it has 4 methods
//       hasNext();
// 		 next();
//		 hasPrevious();
// 		 previous();
//

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1 =new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("elements of o1 "+o1);
		
		ListIterator<Integer> itr=o1.listIterator();
		
		System.out.println("forward direction  ");
		while(itr.hasNext()){
			System.out.println(itr.hasNext());
		}
		
		System.out.println("backward direction  ");
		while(itr.hasPrevious()){
			System.out.println(itr.hasPrevious());
		}
		

	}

}
