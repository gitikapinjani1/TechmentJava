package com.techment.day14.multithreading;

class Message extends Thread
{
	public void run(){
		System.out.println("this is my task");
	}
}

public class CreatingThreadByExtends {

	public static void main(String[] args) {
		
		Message message=new Message();
		message.start();
		
	}

}
