package com.cg.FlightManagement.Exception;

public class BookingNotAddedException extends Exception{
	private int bookingId;
	public BookingNotAddedException() {
		super();
	}
	public BookingNotAddedException(int bookingId) {
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
