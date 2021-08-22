package com.yash.exceptions_practice;

import java.util.Arrays;

public class ArrayExcetions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5};
		int c = num[1]+num[2];
		String name = "Abdeali";
		try {
			System.out.println(num[7]);			//It throws ArrayIndexOutOfBoundsException
		}catch(IndexOutOfBoundsException e) { 	//IndexOutOfBoundsException is the parent class of both the Exceptions 
			//System.out.println(e);
			e.printStackTrace();
		}finally {								//This block will run even there is an Exception/Error in the code
			System.out.println(Arrays.toString(num));
		}
		
		try{
			System.out.println(name.charAt(7));		//It throws StringIndexOutOfBoundsException
		}catch(StringIndexOutOfBoundsException e){	//It will be thrown when we try to fetch the Element of String which is not present
			e.printStackTrace();
		}finally {									//This block will run even there is an Exception/Error in the code
			System.out.println(name);
		}
	}

}
