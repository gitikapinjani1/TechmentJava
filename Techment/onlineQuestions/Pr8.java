package com.Techment.onlineQuestions;

public class Pr8 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int larg=arr[0];
		int larg1=arr[0];
		int small1=arr[0];
		int small=arr[0];
		for(int i=0;i<10;i++){
			if(larg<arr[i])
			{
				larg1=larg;
				larg=arr[i];
			}
			if(small>arr[i])
			{
				small1=small;
				small=arr[i];
			}
			if(larg==larg1){
				if(larg1<arr[i])
					larg1=arr[i];	
			}
			if(small==small){
				if(small1<arr[i])
				{
					if(small1>=small)
					small1=arr[i];	
				}
			}
				
		}
		System.out.println(larg);
		System.out.println(larg1);
		System.out.println(small1);
		System.out.println(small);
			
	}

}
