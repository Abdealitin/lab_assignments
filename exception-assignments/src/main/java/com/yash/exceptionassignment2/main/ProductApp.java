package com.yash.exceptionassignment2.main;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Creating the main class for the product app
 * @author Abdeali Tinwala
 *
 */
import com.yash.exceptionassignment2.exception.EmptyListException;
//import com.yash.exception_assignments.InvalidNameException;
import com.yash.exceptionassignment2.exception.InvalidIdException;
import com.yash.exceptionassignment2.exception.InvalidNameException;
import com.yash.exceptionassignment2.exception.InvalidPriceException;
import com.yash.exceptionassignment2.model.Product;


public class ProductApp {
	
	public static void idCheck(int id) throws InvalidIdException {
		if(id<0 || id>10000)
			throw new InvalidIdException("Please Enter a valid Id!");
	}
	
	public static void nameCheck(String name) throws InvalidNameException {
		if(name.length()<=3 || name.length()>15)
			throw new InvalidNameException("Please Enter a Valid Name!");
	}
	
	public static void priceCheck(double price) throws InvalidPriceException {
		if(price<10 || price>100000) {
			throw new InvalidPriceException("Please Enter a valid Price!");
		}
	}
	
	public static void checkList(Product[] prods) throws EmptyListException {
		if(prods.length<=0)
			throw new EmptyListException("Please Enter at least one Product!");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product details:");
		Product prods[] = new Product[3];
		try {
			for(int i=1; i<=3; i++) {
				System.out.println("Enter details for product"+i);
				System.out.println("Enter Id:");
				int id = sc.nextInt();
				idCheck(id);
				
				System.out.println("Enter Name:");
				String name = sc.next();
				nameCheck(name);
				
				System.out.println("Enter Price:");
				double price = sc.nextDouble();
				priceCheck(price);
				
				prods[i-1] = new Product(id,name,price);
			}
			System.out.println("Product List:");
			System.out.println(Arrays.toString(prods));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
