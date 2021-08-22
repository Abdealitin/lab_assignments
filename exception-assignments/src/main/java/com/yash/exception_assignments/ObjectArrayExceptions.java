package com.yash.exception_assignments;

public class ObjectArrayExceptions {
	public static void main(String []args) {
		Product p = new Product();
		Product[] products = new Product[6];
		products[0] = new Product(0,"Shirt", 200);
		products[1] = new Product(1,"Mobile", 50000);
		products[2] = new Product(2,"Watch",1000);;
		products[3] = new Product(3,"Headphones",600);
		products[4] = new Product(4,"Mouse",250);
		
		try {
			p=products[5];
			System.out.print(p.getId());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		try {
			p=products[7];
			System.out.println(p);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
}
}
