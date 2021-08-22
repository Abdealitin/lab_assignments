package com.yash.exceptions_practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePrctice {
	public static void getFile() throws Exception, IOException {
		File file = new File("file1.txt");
		try (FileInputStream fin = new FileInputStream("Demo.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);

				FileOutputStream fout = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(fout);) {
			String s = "Hello! Good Evening :)";
			byte b[] = s.getBytes();
			bout.write(b);
			int l;
			while ((l = bin.read()) > 0)
				System.out.print((char)l);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		getFile();
	}

}
