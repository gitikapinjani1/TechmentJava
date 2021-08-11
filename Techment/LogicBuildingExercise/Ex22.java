package com.Techment.LogicBuildingExercise;

import java.util.ArrayList;
import java.util.Collections;


public class Ex22 {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		for(int i=0;i<args.length;i++){
			name.add(args[0]);
		}
		Collections.sort(name);
		System.out.println("After Sorting:- "+name);
		
	}

}
