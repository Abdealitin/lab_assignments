package com.yash.tdddemos1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyFormatter {
	public static String format(double value) {
	    if(value < 1000) {
	        return format("###", value);
	    } else {
	        double hundreds = value % 1000;
	        int other = (int) (value / 1000);
	        return format(",##", other) + ',' + format("000", hundreds);
	    }
	}

	private static String format(String pattern, Object value) {
	    return new DecimalFormat(pattern).format(value);
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double currency = sc.nextDouble();
		System.out.println("Rs: "+format(currency));
	}

}
