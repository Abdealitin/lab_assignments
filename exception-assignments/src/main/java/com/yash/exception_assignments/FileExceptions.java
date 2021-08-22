package com.yash.exception_assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptions {
	
	public static void readDoc()  {
		File f = new File("D:\\Test.txt");
		FileReader fr;
		try {
			fr = new FileReader(f);
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readDoc();
	}

}
