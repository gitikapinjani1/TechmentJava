package com.techment.day12.newFeatures;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionInterface {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate=(num)->num>18;
		
		System.out.println(predicate.test(20));
		
		Predicate<String> strPredicate=(name)->name.contains("a");
		System.out.println(strPredicate.test("gitika"));
		
		BinaryOperator<Integer> bo=(a,b)->a+b;
		System.out.println(bo.apply(2, 3));
		
		
		Function<Integer, Integer> function1=(num1)->num1;
		Function<Integer, String> function2=(num1)->"value of num1 = "+num1;
		Function<String, Integer> function3=(name)->name.length();
		
		System.out.println(function1.apply(3));
		System.out.println(function2.apply(40));
		System.out.println(function3.apply("gitika"));
		
		
	}

}
