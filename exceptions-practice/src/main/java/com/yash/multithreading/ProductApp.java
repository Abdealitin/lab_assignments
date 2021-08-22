package com.yash.multithreading;

import java.util.ArrayList;

import com.yash.miltithreaddemo.model.Product;

class List extends Thread{
	
	synchronized public ArrayList<Product> getList(){
		ArrayList<Product> prods = new ArrayList<Product>();
		prods.add(new Product("watch",1200));
		prods.add(new Product("Oil",200));
		prods.add(new Product("Specs",800));
		prods.add(new Product("Mobile",15000));
		prods.add(new Product("Shirt",1500));
		prods.add(new Product("Bag",3000));
		
		return prods;
	}
	
	public void run() {
		System.out.println("Product List .......");
		System.out.println(getList());
		
	}


}

class AddProduct extends Thread{
	
	synchronized public ArrayList<Product> addProduct() {
		List l = new List();
		ArrayList<Product> prods = l.getList();
		ArrayList<Product> cart = new ArrayList<Product>();
		cart.add(prods.get(1));
		cart.add(prods.get(2));
		
		return cart;
	}
	
	public void run() {
		System.out.println("Adding Product");
		addProduct();
	}
}

class VerifyCart extends Thread{
	
	synchronized public ArrayList<Product> getCart(){
		AddProduct ap  = new AddProduct();
		ArrayList<Product> cartList = ap.addProduct();
		return cartList;
	}
	
	public void run() {
		System.out.println("Your Cart Contains :");
		System.out.println(getCart());
	}
}

class DoPayment extends Thread{
	
	synchronized public double totalAmount() {
		VerifyCart vc = new VerifyCart();
		ArrayList<Product> cartList = vc.getCart();
		Product p1 = cartList.get(0);
		Product p2 = cartList.get(1);
		
		double amount = (p1.getPrice()+p2.getPrice());
		
		return amount;
	}
	
	public void run() {
		System.out.println("Your Total Amount Payable : "+totalAmount());
	}
}

class ConfirmPayment extends Thread{
	synchronized public double confirmAmount() {
		DoPayment dp = new DoPayment();
		double amount = dp.totalAmount();
		return amount;
	}
	public void run() {
		System.out.println("Are you sure You want to pay: "+confirmAmount());
	}
}

class Reciept extends Thread{
	synchronized public void printReciept() {
		VerifyCart vc = new VerifyCart();
		ArrayList<Product> cartList = vc.getCart();
		System.out.println("=======Your Invoice========");
		for(Product p:cartList) {
			System.out.println(p);
		}
		System.out.println("Happy Shopping :)");
	}
	
	public void run() {
		printReciept();
	}
}

public class ProductApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new List();
		AddProduct add  = new AddProduct();
		VerifyCart vc = new VerifyCart();
		DoPayment dp = new DoPayment();
		ConfirmPayment c = new ConfirmPayment();
		Reciept re = new Reciept();
		l.start();
		add.start();
		vc.start();
		dp.start();
		c.start();
		re.start();
	}



}
