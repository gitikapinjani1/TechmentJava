package com.Techment.day7.Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println("elements of stack"+s1);
		System.out.println("top element "+ s1.peek());
		s1.pop();
		System.out.println("after removing "+s1);
		
		System.out.println("top element "+ s1.peek());
		
	}

}
