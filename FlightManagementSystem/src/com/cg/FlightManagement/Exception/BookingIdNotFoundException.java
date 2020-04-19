package com.cg.FlightManagement.Exception;

public class BookingIdNotFoundException extends Exception{
	private int bookingId;
	public BookingIdNotFoundException() {
		super();
	}
	public BookingIdNotFoundException(int bookingId) {
		super();
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return bookingId + "This Boking ID does not exist";
	}
	@Override
	public String getMessage() {
		return bookingId + "This Booking Id does not exist";
	}
	

}
