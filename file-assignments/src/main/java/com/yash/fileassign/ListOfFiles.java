package com.yash.fileassign;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ListOfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of files are :");
		File file = new File("D:\\company");
		File[] files = file.listFiles();
		int i=1;
		for(File f:files) {
			System.out.println(i+". "+f.getName());
			i++;
		}
		System.out.println("Select any file to perform read/write operation :");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		File newFile = new File(files[(index-1)].getPath());
		try {
			FileReader fr = new FileReader(newFile);
			int j;
			while((j=fr.read())!=-1)    
		          System.out.print((char)j);
			fr.close();
			
			System.out.println("\nDo you wan to write Something(Y/N)?");
			String ans = sc.next();
			if(ans.equals("Y")) {
				System.out.println("Write Something to append in the file :");
				String line = sc.next();
				FileWriter fw = new FileWriter(newFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(line);
				
				System.out.println("Data Successfully Added :)");
				pw.flush();
			}else {
				System.out.println("Thank you!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
