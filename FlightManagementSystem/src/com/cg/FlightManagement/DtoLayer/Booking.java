package com.cg.FlightManagement.DtoLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Booking {
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate
				+ ", passengerList=" + passengerList + ", ticketCost=" + ticketCost + ", flight=" + flight
				+ ", noOfPassengers=" + noOfPassengers + "]";
	}

	private static int bookingId;
	private User userId;
	private Date bookingDate;
	private List <Passenger> passengerList= new ArrayList<Passenger>();
	private long ticketCost;
	private Flight flight;
	private int noOfPassengers;
	public static int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public long getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(long ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
}
