package com.cg.FlightManagement.Exception;

public class BookingNotFoundException extends Exception{
	private int bookingId;
	public BookingNotFoundException() {
		super();
	}
	public BookingNotFoundException(int bookingId) {
		super();
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return bookingId + "This Booking ID does not exist";
	}
	@Override
	public String getMessage() {
		return bookingId + "This Booking Id does not exist";
	}
	

}
