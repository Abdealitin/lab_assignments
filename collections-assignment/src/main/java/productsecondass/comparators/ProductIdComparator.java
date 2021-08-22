package productsecondass.comparators;


import java.util.Comparator;



import productsecondass.model.Product;
public class ProductIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId())
			return 1;
		else
			return -1;

	}
}
