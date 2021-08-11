package com.Techment.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	
	int id;
	String name;
	int price;
	int quantity;
	
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}

class QuantitySorting implements Comparator<Product>
{

	public int compare(Product o1, Product o2) {
		if(o1.quantity==o2.quantity)
		return 0;
		else if(o1.quantity<o2.quantity)
		return 1;
		else
			return -1;
	}
	
}

class PriceSorting implements Comparator<Product>
{

	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
		return 0;
		else if(o1.price>o2.price)
		return 1;
		else
			return -1;
	}
	
}



public class ComparatorDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product(1, "pen",  25, 20));
		product.add(new Product(2, "book", 500, 10));
		product.add(new Product(3, "toy",   10,30));
		
		
		
		for(Product p :product)
		{
			if(p.price>=500)
			System.out.println(p);
		}
		System.out.println("============================Sorting by quantity================");

		Collections.sort(product,new QuantitySorting());
		for(Product p :product)
		{
			System.out.println(p);
		}
		System.out.println("============================Sorting by Price================");

		Collections.sort(product,new PriceSorting());
		for(Product p :product)
		{
			System.out.println(p);
		}


		
		
		
	}

}
