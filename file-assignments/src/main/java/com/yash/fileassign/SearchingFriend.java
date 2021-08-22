package com.yash.fileassign;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchingFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\company\\Names.txt");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			final Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String lineFromFile = scanner.nextLine();
				if(lineFromFile.contains(name)) { 
					// a match!
					//System.out.println("I found " +name+ " in file " +file.getName());
					System.out.println(lineFromFile);
					break;
				}
			}
			

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
