package com.Techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("abc.txt",true);
		
		fw.write("hello \n");
		fw.write(92);
		fw.write(94);
		System.out.println("written successfuly.....");
		fw.close();
		
		
	}

}
