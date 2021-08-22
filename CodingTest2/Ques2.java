package com.techment.CodingTest;

public class Ques2 {

	public static void main(String[] args) {
		
		Ques2 q=new Ques2();
		System.out.println(q.repeatEnd("Hello",3));
		System.out.println(q.repeatEnd("Hello", 2));
		System.out.println(q.repeatEnd("Hello", 1));
		
	}
	
	public String repeatEnd(String str, int n)
	{
		int len;
		String strResult="";
		for(int i=n;i>0;i--)
		{
			
			for(int j=1;j<=n;j++)
			{
				len=str.length()-n+j-1;
				strResult+=str.charAt(len);
			}
		}
		return strResult;
	}

}
