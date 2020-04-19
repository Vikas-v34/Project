package com.cg.FlightManagement.DtoLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cg.FlightManagement.DaoLayer.User;

public class Booking {
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", passengerList=" + passengerList + ", ticketCost=" + ticketCost + ", flight=" + flight
				+ ", noOfPassengers=" + noOfPassengers + "]";
	}
	private static int bookingId = 0;
	public User userId;
	public Date bookingDate;
	public List <Passenger> passengerList= new ArrayList<Passenger>();
	public long ticketCost;
	public Flight flight;
	public int noOfPassengers;
	public static int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
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
