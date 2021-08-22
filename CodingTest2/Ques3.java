package com.techment.CodingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.techment.day12.newFeatures.Employee;

class WWE{
	
	private String firstName;
	private String lastName;
	private int weight;
	
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

public class Ques3 {

	public static void main(String[] args) {
		
		ArrayList<WWE> wrestlers=new ArrayList<WWE>();
		
		wrestlers.add(new WWE("gitika", "pinjani", 60));
		wrestlers.add(new WWE("katyani", "sahu", 50));
		wrestlers.add(new WWE("divya", "kashyap", 70));
		wrestlers.add(new WWE("rajshree", "dewangan", 80));
		wrestlers.add(new WWE("arpit", "masih", 90));
		
		//ques a
		System.out.println("number of wrestlets are "+wrestlers.stream().count());
		//ques b
		int sumWeight=wrestlers.stream().filter(e->e.getWeight()>70).mapToInt(i->i.getWeight()).sum();
		System.out.println("Sum of weight greater than 70 is "+sumWeight);
		//ques 
		printFirstName(wrestlers);
		//ques d
		Optional<WWE> minWeight=wrestlers.stream().min(Comparator.comparing(WWE::getWeight));
		System.out.println(minWeight);
		
		
	}

	private static void printFirstName(List<WWE> wrestlers) {
		System.out.println("\nAll Wrestler First name: ");
		wrestlers.stream().map(WWE::getFirstName).forEach(System.out::println);
	}
	
}
