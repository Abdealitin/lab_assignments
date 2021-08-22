package productsecondass.main;

import java.util.Scanner;

import productsecondass.service.ProductService;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService ps = new  ProductService();
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		while(n==0) {
			System.out.println("Please choose one from the given below:"
					+ "\n 1.Add Product to cart"
					+ "\n 2.Get the size of the cart."
					+ "\n 3.Cloning the cart"
					+ "\n 4.Sort By Id"
					+ "\n 5.Sort by name"
					+ "\n 6.Sort ny price"
					+ "\n 7.Get the first Product"
					+ "\n 8.Get the Last Product"
					+ "\n 9.Exit");
			int c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("Enter the produt id:");
				int id = sc.nextInt();
				System.out.println("Enter the produt name:");
				String name = sc.next();
				System.out.println("Enter the produt quantity:");
				int quantity = sc.nextInt();
				System.out.println("Enter the produt price:");
				double price  = sc.nextDouble();
				
				ps.addProduct(id, name, quantity, price);
				System.out.println("Product Added...");
				break;
				
			case 2:
				System.out.println("Product cart Size is : "+ps.getCartSize());
				break;
				
			case 3:
				ps.cloneSet();
				System.out.println("art has been cloned");
				break;
				
			case 4:
				System.out.println(ps.sortById());
				break;
				
			case 5:
				System.out.println(ps.sortByName());
				break;
				
			case 6:
				System.out.println(ps.sortByPrice());
				break;
				
			case 7:
				System.out.println(ps.getFirstProduct());
				break;
				
			case 8:
				System.out.println(ps.getLastProduct());
				break;
				
			case 9:
				n++;
				break;
			}
		}
	}

}
