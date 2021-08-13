package com.Techment.day9.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("xyz.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		char ch[]={'a','b','c','d','e'};
		bw.write(ch);
		bw.newLine();
		bw.write("bhaskar");
		bw.flush();
		bw.close();
		System.out.println("done");
		
		
		
		
		
	}

}
