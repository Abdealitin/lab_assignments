package com.yash.miltithreaddemo.service;

import java.util.ArrayList;

import com.yash.miltithreaddemo.model.Product;

public class GetList implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		productList p = new productList();
		ArrayList<Product> prods = p.createList();
		
		System.out.println(p);
	}
	
}
