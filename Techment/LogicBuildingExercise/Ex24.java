package com.Techment.LogicBuildingExercise;

import java.util.HashMap;
import java.util.Scanner;


class Question{
	
	String question;
	String op1,op2,op3,op4;
	int correctAns;
	public Question(String question, String op1, String op2, String op3,
			String op4, int correctAns) {
		super();
		this.question = question;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.correctAns = correctAns;
	}
	
}
public class Ex24 {

	public static void main(String[] args) {
		Question q1=new Question("Name of the pink city","raipur","bhilai","jaipur","delhi",3);
		Question q2=new Question("what is the colour of the tree?","blue","red","green","black",3);
		
		HashMap<Integer,Question> hm=new HashMap<Integer,Question>();
		hm.put(1,q1);
		hm.put(2, q2);
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		System.out.println(hm.get(num).question);
		System.out.println(hm.get(num).op1);
		System.out.println(hm.get(num).op2);
		System.out.println(hm.get(num).op3);
		System.out.println(hm.get(num).op4);
		
		
		System.out.println("Enter correct Answer");
		int ans=scanner.nextInt();
		
		if(ans==hm.get(num).correctAns){
			System.out.println("your answer is correct");
		}
		else 
			System.out.println("your ans is not correct");
		
		
		
		
	}

}
