package com.Techment.OopsAssignment;


class Book{
	
	private int bookNo;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
class EngineeringBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
public class Ex2 {

	public static void main(String[] args) {
		EngineeringBook eg=new EngineeringBook();
		
		eg.setBookNo(101);
		eg.setAuthor("gitika");
		eg.setPrice(500);
		eg.setCategory("Computer Science");
		
		System.out.println("book no.= "+eg.getBookNo()+" author= "+eg.getAuthor()+" price = "+eg.getPrice()+" category = "+eg.getCategory());
		
		
	}

}
