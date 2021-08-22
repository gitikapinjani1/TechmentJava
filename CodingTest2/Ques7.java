package com.techment.CodingTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter Array Elements:");
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}

		System.out.println("\nArray Element");
		for (Integer element : list) {
			System.out.print(element + "\t");
		}

		spiltArray(list, size);
	}

	private static void spiltArray(ArrayList<Integer> list, int size) {
		int halfOfSize;
		if(size%2==0)
		 halfOfSize = (int) Math.ceil(size / 2);
		else
		{
		double size2=size+0.5;
		halfOfSize =(int) Math.ceil(size2 / 2);
		}
		System.out.println(halfOfSize);
		ArrayList<Integer> splitList1 = new ArrayList<Integer>();
		ArrayList<Integer> splitList2 = new ArrayList<Integer>();

		for (int i = 0; i < halfOfSize; i++) {
			splitList1.add(list.get(i));
		}

		for (int i = halfOfSize; i < size; i++) {
			splitList2.add(list.get(i));
		}

		System.out.println("\nFirst Array Element");
		for (Integer element : splitList1) {
			System.out.print(element + "\t");
		}

		System.out.println("\nSecond Array Element");
		for (Integer element : splitList2) {
			System.out.print(element + "\t");
		}

		int max1 = Collections.max(splitList1);
		System.out.println("\nMax Element in Array1 : " + max1);

		int max2 = Collections.max(splitList2);
		System.out.println("\nMax Element in Array2 : " + max2);
	}
}


