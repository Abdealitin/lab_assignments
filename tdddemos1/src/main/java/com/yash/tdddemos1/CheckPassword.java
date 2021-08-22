package com.yash.tdddemos1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {
	public static void main(String []args) {
	String regex = "[A-S][02468][a-zA-Z0-9+#$]*1";
	Scanner sc = new Scanner(System.in);
	String password = sc.nextLine();
	Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);
    if(matcher.find())
    	System.out.println("Valid Password");
    else
    	System.out.println("Not a valid Password");
}
}
