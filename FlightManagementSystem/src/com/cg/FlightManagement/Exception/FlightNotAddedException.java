package com.cg.FlightManagement.Exception;

public class FlightNotAddedException extends Exception{
	private int flightNumber;
	public FlightNotAddedException() {
		super();
	}
	public FlightNotAddedException(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}
	@Override
	public String toString() {
		return flightNumber + "This flight Number does not exist";
	}
	@Override
	public String getMessage() {
		return flightNumber + "This flight Number does not exist";
	}
	


}
