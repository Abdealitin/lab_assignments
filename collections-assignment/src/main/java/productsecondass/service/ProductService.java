package productsecondass.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import productsecondass.comparators.ProductIdComparator;
import productsecondass.comparators.ProductNameComparator;
import productsecondass.comparators.ProductPriceComparator;
import productsecondass.model.Product;
public class ProductService {
	HashSet<Product> cart = getCart();
	
	public HashSet<Product> getCart(){
		HashSet<Product> cart = new HashSet<Product>();
		cart.add(new Product(101,"Oil",2,250));
		cart.add(new Product(107,"Flour",1,50));
		
		return cart;
	}
	
	public void addProduct(int id, String name, int quantity, double price) {
		try{
			cart.add(new Product(id,name,quantity,price));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getCartSize() {
		return cart.size();
	}
	
	public List<Product> sortById(){
		List<Product> list = new ArrayList<Product>(cart);
		Collections.sort(list, new ProductIdComparator());
		
		return list;
	}
	
	public List<Product> sortByName(){
		List<Product> list = new ArrayList<Product>(cart);
		Collections.sort(list, new ProductNameComparator());
		
		return list;
	}
	
	public List<Product> sortByPrice(){
		List<Product> list = new ArrayList<Product>(cart);
		Collections.sort(list, new ProductPriceComparator());
		
		return list;
	}
	
	public HashSet<Product> cloneSet(){
		HashSet<Product> clonedSet = (HashSet<Product>) cart.clone();
		return clonedSet;
	}
	
	LinkedHashSet<Product> newCart = (LinkedHashSet<Product>) cart;
	
	public Product getFirstProduct() {
		Iterator<Product> itr = newCart.iterator();
		return itr.next();
	}
	
	public Product getLastProduct() {
		Iterator<Product> itr = newCart.iterator();
		Product p = new Product();
		while(itr.hasNext()) {
			p = itr.next();
		}
		
		return p;
	}
}

