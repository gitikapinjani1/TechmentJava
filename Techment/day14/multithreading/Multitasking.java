package com.techment.day14.multithreading;

class Sanika extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sanika : "+i+" msg: Welcome to banglore");
		}
	}
}

class Parul extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("PArul : "+i+"msg:  Take vaccination");
		}
	}
}

class Amit extends Thread{
	public void run()
	{
		for(int i=1;i<=8;i++)
		{
			System.out.println("Amit : "+i+" msg: Covid 19 is not over yet");
		}
	}
}

public class Multitasking {

	public static void main(String[] args) {
		
		Sanika sanika=new Sanika();
		Parul parul =new Parul();
		Amit amit =new Amit();
		
		sanika.start();
		parul.start();
		amit.start();
		
	}

}
