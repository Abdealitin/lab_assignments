package com.yash.exception_assignments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Abdeali Tinwala
 *
 */
public class ProductApp 
{
	public static void nameCheck(String name) throws InvalidNameException {
		if(name.length() < 4)
			throw new InvalidNameException("Invalid Name");
		String regex = "[A-Za-z]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		if(!m.matches())
			throw new InvalidNameException("Invalid Name!");
//		if(n.length > 0)
//			throw new InvalidNameException("Invalid Name");
	}
	public static void priceCheck(double price) throws InvalidPriceException {
		if(price > 0 || price < 100000)
			throw new InvalidPriceException("Invalid Price!");
	}
    public static void main( String[] args )
    {
        Product[] prods = new Product[5];
        for(int i=0; i<5; i++) {
        	try {
        		System.out.println("Product "+(i+1));
        		System.out.println("Id: ");
        		Scanner sc = new Scanner(System.in);
        		int id = sc.nextInt();
        		
        		System.out.println("Name :");
        		String name = sc.next();
        		nameCheck(name);
        		
        		System.out.println("Price: ");
        		double price = sc.nextDouble();
        		priceCheck(price);
        		
        		prods[i]= new Product(id,name,price);
        	}catch(Exception e) {
        		e.printStackTrace();
        		break;
        	}
        }
        //System.out.println(Arrays.toString(prods));
    }
}
