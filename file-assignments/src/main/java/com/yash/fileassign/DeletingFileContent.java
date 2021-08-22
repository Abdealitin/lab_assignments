package com.yash.fileassign;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeletingFileContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name or file path:");
		Scanner sc  = new Scanner(System.in);
		String path = sc.next();
		
		try {
			File file = new File(path);
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
			System.out.println("Contents deleted sucessfully!");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
