package com.Techment.day9.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("abc.txt");
		int ch=fr.read();
		
		while(ch!=-1)
		{
		System.out.print((char)ch);
		ch=fr.read();
		}
		
	}

}
