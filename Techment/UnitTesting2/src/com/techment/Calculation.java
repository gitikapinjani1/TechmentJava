package com.techment;

import java.util.StringTokenizer;

public class Calculation {

	public static int findMax(int arr[]) {
		
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int cube(int n) {
		return n*n*n;
	}
	
	public static String reverseWord(String str) {
		
		
		StringBuilder result = new StringBuilder();
		StringTokenizer tokernizer=new StringTokenizer(str, " ");
		
		while(tokernizer.hasMoreTokens()) {
			
			StringBuilder sb = new StringBuilder();
			sb.append(tokernizer.nextToken());
			sb.reverse();
			
			result.append(sb);
			result.append(" ");
		}
		
		return result.toString();
		
		
	}
	
	
}
