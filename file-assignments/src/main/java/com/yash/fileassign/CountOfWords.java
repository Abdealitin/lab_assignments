package com.yash.fileassign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name or file path:");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		try {
			File file = new File(path);
			
			FileInputStream fstream = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
			String line;
			int count=0;
			while((line = reader.readLine())!=null) {
				count+=line.length();
			}
			
			System.out.println("Total word count = "+count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
