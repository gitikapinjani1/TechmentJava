package com.Techment.day9.io;
import java.io.File;
import java.io.IOException;
public final class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\Techment\\abc.txt");
		System.out.println(file.exists());
		//file.createNewFile();
		file.mkdir();
		System.out.println(file.exists());
	}

}
