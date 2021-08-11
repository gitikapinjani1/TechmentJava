package com.Techment.LogicBuildingExercise;

import java.util.ArrayList;

class Product{
	private int id;
	private String name;
	private int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
	
	
	
	
	
}
public class Ex21 {

	public static void main(String[] args) {
		
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(new Product(1,"pen",20));
		product.add(new Product(2,"book",200));
		product.add(new Product(3,"toy",100));
		
		
		for(Product p: product)
		{
			if(p.getId()==2)
				System.out.println(p.toString());
			else
				System.out.println("product not found");
		}
		
		
		
		
	}

}
