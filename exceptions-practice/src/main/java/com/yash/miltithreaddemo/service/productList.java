package com.yash.miltithreaddemo.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.miltithreaddemo.model.Product;

//package com.yash.miltithreaddemo.*;

public class productList {
	public ArrayList<Product> createList(){
		ArrayList<Product> prods = new ArrayList<Product>();
		prods.add(new Product("watch",1200));
		prods.add(new Product("Oil",200));
		prods.add(new Product("Specs",800));
		prods.add(new Product("Mobile",15000));
		prods.add(new Product("Shirt",1500));
		prods.add(new Product("Bag",3000));
		prods.add(new Product("Book",500));
		prods.add(new Product("Hankerchief",50));
		prods.add(new Product("Tie",150));
		prods.add(new Product("Shoes",2800));
		
		return prods;
	}
}
