package productsecondass.comparators;

import java.util.Comparator;

import productsecondass.model.Product;
public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
	    return o1.getName().compareTo(o2.getName());	
	}
}
