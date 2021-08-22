package com.yash.miltithreaddemo.service;

import java.util.ArrayList;

import com.yash.miltithreaddemo.model.Product;

public class AddProduct {
	public ArrayList<Product> addProduct(Product p){
		
		ArrayList<Product> cartList = new ArrayList<>();
		
		cartList.add(p);
		
		return cartList;
	}
}
