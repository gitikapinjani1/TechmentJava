package com.Techment.CodingTest1;


class Animal{
	void Shout(){
		System.out.println("Shout Loudly");
	}
}
class Dog extends Animal{
	void Shout(){
		System.out.println("Dog is Shouting");
	}
	
}
class Horse extends Animal{
	void Shout(){
		System.out.println("Horse is Shouting");
	}
	
}
class Cat extends Animal{
	void Shout(){
		System.out.println("Cat is Shouting");
	}
	
}
public class Ques4 {

	public static void main(String[] args) {
		
		Animal dog=new Dog();
		Animal horse=new Horse();
		Animal cat=new Cat();
		
		dog.Shout();
		horse.Shout();
		cat.Shout();
		
		
		
		
	}

}
