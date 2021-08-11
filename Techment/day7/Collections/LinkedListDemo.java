package com.Techment.day7.Collections;

import java.util.LinkedList;

//it is implements list interface
//allow duplicates and maintains insertion order
//it uses data structure double linked list to store the element
//Advan - insertion is good
//DisA - retrival is not good, because it traverse from 1st node.


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList o1=new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addLast(101);
		o1.add(4);
		o1.addFirst(5);
		
		System.out.println("LinkedList: "+o1);
		
		o1.removeLast();
		
		System.out.println(o1);
		
		
	}

}
