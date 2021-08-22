package com.yash.tdddemos1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidYashMail {
	public static void main(String []args) {
		String regex = "^[a-zA-Z+_.-]+@\\byash.com\\b+$";
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);
	    if(matcher.find())
	    	System.out.println("Valid Yash Email address");
	    else
	    	System.out.println("Not a valid Yash Email Address");
	}

}
