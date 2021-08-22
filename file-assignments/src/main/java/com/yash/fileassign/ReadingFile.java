package com.yash.fileassign;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("D:\\company");
		System.out.println(file1.mkdir());
		File file = new File("D:\\company\\bsicinfo.txt");
		System.out.println(file.createNewFile());
		
		try(FileWriter outfile = new FileWriter(file);){
			
			outfile.write("welcome to the company");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileReader inFile = new FileReader(file);
			int i;    
	        while((i=inFile.read())!=-1)    
	          System.out.print((char)i); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
