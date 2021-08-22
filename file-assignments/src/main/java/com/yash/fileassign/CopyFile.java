package com.yash.fileassign;

/**
 * Creating a Program for copying file
 * @author Abdeali Tinwala
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the file objects for input and output operations
		File inputFile = new File("C:\\Users\\Abdeali Tinwala\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\file-assignments\\target\\file1.txt");
		File outputFile = new File("C:\\Users\\Abdeali Tinwala\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\file-assignments\\target\\file2.txt");
		
		try(FileInputStream instream = new FileInputStream(inputFile);
			FileOutputStream outstream = new FileOutputStream(outputFile);){
			
			//Creating a buffer
			byte[] buffer = new byte[1024];
			
			int len;
			
			//logic for copying file
			while((len = instream.read(buffer))>0)
				outstream.write(buffer, 0, len);
			
			System.out.println("File Copied Successfully!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
