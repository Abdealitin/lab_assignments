package moviebooking.service;

import java.util.Collections;
import java.util.LinkedList;

import moviebooking.comparator.IdComparator;
import moviebooking.model.Customer;
import moviebooking.model.Ticket;

public class MovieService {
	LinkedList<Ticket> tickets = getTickets();
	
	public LinkedList<Ticket> getTickets(){
		LinkedList<Ticket> list = new LinkedList<Ticket>();
		list.add(new Ticket(101,"F1","21 Aug",new Customer("Jack",22,"9999999999")));
		list.add(new Ticket(102,"S1","21 Aug",new Customer("Rose",20,"9999999999")));
		list.add(new Ticket(103,"F10","21 Aug",new Customer("John",25,"9999999999")));
		list.add(new Ticket(104,"S12","21 Aug",new Customer("Diana",28,"9999999999")));
		
		return list;
	}
	
	public LinkedList<Ticket> getAllTickets(){
		return tickets;
	}
	
	public Ticket getFirst() {
		Ticket t = tickets.getFirst();
		return t;
	}
	
	public Ticket getLast() {
		Ticket t= tickets.getLast();
		return t;
	}
	
	public void removeFirst() {
		tickets.removeFirst();
		System.out.println("Sucessfully removed");
	}
	
	public void addFirst(int id,String seat,String date,String name, int age, String contact) {
		tickets.addFirst(new Ticket(id,seat,date,new Customer(name,age,contact)));
	}
	
	public void addLast(int id,String seat,String date,String name, int age, String contact) {
		tickets.addLast(new Ticket(id,seat,date,new Customer(name,age,contact)));
	}
	
	public void sortList() {
		Collections.sort(tickets,new IdComparator());
		for(int i=1; i<6; i++) {
			System.out.println(tickets.get(i));
		}
	}
	
	public int getSize() {
		return tickets.size();
	}
	
	public Ticket getFifth() {
		return tickets.get(5);
	}
}
