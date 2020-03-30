package daoLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {
	public long bookingId;
	public User userId;
	public Date bookingDate;
	public List <Passenger> passengerList= new ArrayList<Passenger>();
	public long ticketCost;
	public Flight flight;
	public int noOfPassengers;
}
