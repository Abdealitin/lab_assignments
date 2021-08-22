package com.yash.fileassign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class SetToReadOnly {

	public static void setReadOnly(File file) {
		file.setReadOnly();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		File file = new File(path);
		//setReadOnly(file);
		file.setWritable(true);
		
		try {
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
