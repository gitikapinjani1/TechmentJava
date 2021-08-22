package com.techment.CodingTest;

public class Ques1 {

	public static void main(String[] args) {
		
		Ques1 q=new Ques1();
		System.out.println(q.repeatFront("Chocolate",4));
		System.out.println(q.repeatFront("Ice Cream", 2));
		
	}
	
	public String repeatFront(String str , int n)
	{
		String stringResult="";
		
		for(int i=n;i>0;i--)
		{
			int len=0;
			for(int j=i;j>0;j--)
			{
				stringResult+=str.charAt(len);
				len++;
			}
		}
		
		return stringResult;
	}

}
