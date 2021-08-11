package com.Techment.day8.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put(1, 2);
		hm.put(2, "hello");
		hm.put(3, 30.30);
		
		System.out.println("HAshMap "+hm);
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(1, 2);
		lhm.put(2, "hello");
		lhm.put(3, 30.30);
		
		System.out.println("LinkedHashMap "+lhm);
		
		TreeMap tm=new TreeMap();
		
		tm.put(1, 2);
		tm.put(2, "hello");
		tm.put(3, 30.30);
		
		System.out.println("TreeMap "+tm);	
	}

}
