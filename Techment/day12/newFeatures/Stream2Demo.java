package com.techment.day12.newFeatures;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream2Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
			
		{
			numbers.add(i);
		}
		System.out.println("printing only even numbers");
		numbers.stream().filter(num->num%2==0).forEach(s->System.out.println(s));
		
//		List<Integer> nu=Arrays.asList(1,2,4);
//		System.out.println(nu);
		
		numbers.stream().map(num->num+100).forEach(s->System.out.println(s));
		
		numbers.stream().map(num->"after adding 100  "+(num+100)).forEach(s->System.out.println(s));
		
		numbers.stream().limit(4).forEach(s->System.out.println(s));
		
		Long size=numbers.stream().count();
		System.out.println("no. of elements"+size);
		
		
	}

}
