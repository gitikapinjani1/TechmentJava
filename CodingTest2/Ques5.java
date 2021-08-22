package com.techment.CodingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ques5 {

	public static void main(String[] args) {
		Map<Integer,Integer> age=new HashMap<Integer,Integer>();
		age.put(1, 28);
		age.put(2, 18);
		age.put(3, 8);
		age.put(4, 38);
		age.put(5, 48);
		
		Ques5 q=new Ques5();
		System.out.println(q.votersList(age));
		
		
	}
	
	List<Integer> votersList(Map<Integer, Integer> age)
	{
		ArrayList<Integer> id=new ArrayList<Integer>();
		for( int i:age.values())
		{
			if(i>18)
				id.add(age.getKey());
		}
		
		return id;
	}

}
