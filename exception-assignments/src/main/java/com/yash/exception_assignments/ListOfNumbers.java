package com.yash.exception_assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ListOfNumbers {
	public static void readList() throws IOException {
		File file = new File("file");
		// try {
		// File file = new File("file");
		// FileInputStream fs = new FileInputStream(file);
		// int i;
		// while((i = fs.read()) != -1) {
		// System.out.println((char)i);
		// }
		// }
		// catch(Exception e) {
		// e.printStackTrace();
		// }
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = reader.readLine();
			String[] numbers = text.split(",");
			int[] num = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				num[i] = Integer.parseInt(numbers[i]);
			System.out.println(Arrays.toString(num));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		readList();
	}
}
