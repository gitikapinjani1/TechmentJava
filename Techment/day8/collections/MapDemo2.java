package com.Techment.day8.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "gitika");
		hm.put(2, "vaibhav");
		System.out.println("hash hm"+hm);
		for(Entry<Integer, String> e :hm.entrySet())
		{
			
		}
	}

}
