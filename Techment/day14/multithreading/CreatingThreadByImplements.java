package com.techment.day14.multithreading;

class Info implements Runnable
{
	@Override
	public void run(){
		System.out.println("this is my task");
	}
}

public class CreatingThreadByImplements {

	public static void main(String[] args) {
		
		Info info=new Info();
		Thread thread=new Thread(info);
		thread.start();
		
	}

}
