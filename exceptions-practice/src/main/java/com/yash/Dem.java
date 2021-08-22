package com.yash;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Dem {


	public static void main(String []args)throws Exception{

	int ch;

	FileReader fr=null;

	try {

	fr = new FileReader("C:\\Users\\Abdeali Tinwala\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\exceptions-practice\\target\\a.txt");
			

	while ((ch=fr.read())!=-1)
		System.out.println((char)ch);

	System.out.println("File Read");

	}

	catch (FileNotFoundException fe) {
		System.out.println("File not found");
	}

	}

}
