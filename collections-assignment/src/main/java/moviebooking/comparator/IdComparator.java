package moviebooking.comparator;

import java.util.Comparator;

import moviebooking.model.Ticket;
import productsecondass.model.Product;

public class IdComparator implements Comparator<Ticket> {
	
	public int compare(Ticket o1, Ticket o2) {
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId())
			return 1;
		else
			return -1;

	}
}
