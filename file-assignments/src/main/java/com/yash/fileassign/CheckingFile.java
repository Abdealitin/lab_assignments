package com.yash.fileassign;

import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;

public class CheckingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the path or the file name:");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		try {
			File file = new File(path);
			System.out.println("File Name : "+file.getName());
			System.out.println("File path : "+file.getPath());
			System.out.println("File parent : "+file.getParent());
			System.out.println("File lenght : "+file.length());
			Date d = new Date(file.lastModified());
			System.out.println("File path : "+d);
			System.out.println("File Content : ");
			
			FileReader fr = new FileReader(file);
			int i;    
	        while((i=fr.read())!=-1)    
	          System.out.print((char)i); 
	        
	        fr.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
