package moviebooking.model;

import java.util.Objects;

public class Ticket {
	int id;
	String seat;
	String booking_date;
	Customer cust;
	public Ticket() {
		super();
	}
	public Ticket(int id, String seat, String booking_date, Customer cust) {
		super();
		this.id = id;
		this.seat = seat;
		this.booking_date = booking_date;
		this.cust = cust;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", seat=" + seat + ", booking_date=" + booking_date + ", cust=" + cust + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(booking_date, cust, id, seat);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(booking_date, other.booking_date) && Objects.equals(cust, other.cust) && id == other.id
				&& Objects.equals(seat, other.seat);
	}
	
	
}
