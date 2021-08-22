package com.yash.exceptions_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void copy() throws IOException {
		File source = new File("D:\\jars\\file_example_MP3_700KB.mp3");
		File destination = new File("D:\\jars\\copy.mp3");
		destination.createNewFile();
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(destination);
		
		byte[] buffer = new byte[1024];
		int l=0;
		while((l = in.read(buffer))>0)
			out.write(buffer, 0, l);
		in.close();
		out.close();
		
		System.out.println("Sucessfully copied....");
	}
	
	public static void main(String[] args) throws IOException {
		copy();
	}
}
