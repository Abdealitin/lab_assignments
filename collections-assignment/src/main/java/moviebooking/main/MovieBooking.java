package moviebooking.main;

import java.util.Scanner;

import moviebooking.service.MovieService;

public class MovieBooking {

	public static void main(String[] args) {
		
		MovieService ms = new MovieService();
		Scanner sc = new Scanner(System.in);
		int d = 0;
		while(d==0) {
			System.out.println("Please Select one option:"
					+ "\n 1.Book a Ticket."
					+ "\n 2.Get All the tickets."
					+ "\n 3.Get first and last booked tickets"
					+ "\n 4.Rmove first Ticket"
					+ "\n 5.Book from first Ticket"
					+ "\n 6.Book from last Ticket"
					+ "\n 7.Sort the tickets"
					+ "\n 8.Get the count of tickets booked"
					+ "\n 9.Get the fifth ticket"
					+ "\n 10.Exit");
			int c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("Enter Ticket Id:");
				int id = sc.nextInt();
				System.out.println("Enter the seat no:");
				String seat = sc.next();
				System.out.println("Enter the booking date:");
				String date = sc.next();
				System.out.println("Enter the name:");
				String name = sc.next();
				System.out.println("Enter age:");
				int age = sc.nextInt();
				System.out.println("Enter the contact no:");
				String contact = sc.next();
				ms.addFirst(id, seat, date, name, age, contact);
				break;
				
			case 2:
				System.out.println(ms.getAllTickets());
				break;
			case 3:
				System.out.println("First ticket : "+ms.getFirst());
				System.out.println("Last ticket : "+ms.getLast());
				break;
				
			case 4:
				ms.removeFirst();
				break;
				
			case 5:
				System.out.println("Enter Ticket Id:");
				int id1 = sc.nextInt();
				System.out.println("Enter the seat no:");
				String seat1 = sc.next();
				System.out.println("Enter the booking date:");
				String date1 = sc.next();
				System.out.println("Enter the name:");
				String name1 = sc.next();
				System.out.println("Enter age:");
				int age1 = sc.nextInt();
				System.out.println("Enter the contact no:");
				String contact1 = sc.next();
				ms.addFirst(id1, seat1, date1, name1, age1, contact1);
				break;
				
			case 6:
				System.out.println("Enter Ticket Id:");
				int id2 = sc.nextInt();
				System.out.println("Enter the seat no:");
				String seat2 = sc.next();
				System.out.println("Enter the booking date:");
				String date2 = sc.next();
				System.out.println("Enter the name:");
				String name2 = sc.next();
				System.out.println("Enter age:");
				int age2 = sc.nextInt();
				System.out.println("Enter the contact no:");
				String contact2 = sc.next();
				ms.addLast(id2, seat2, date2, name2, age2, contact2);
				break;
				
			case 7:
				ms.sortList();
				break;
				
			case 8:
				System.out.println("Count of booked Tickets : "+ms.getSize());
				break;
				
			case 9:
				System.out.println(ms.getFifth());
				break;
				
			case 10:
				d++;
				break;
			
			}
		}

	}

}
