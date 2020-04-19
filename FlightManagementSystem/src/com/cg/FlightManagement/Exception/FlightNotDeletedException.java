package com.cg.FlightManagement.Exception;

public class FlightNotDeletedException extends Exception{
	private int flightNumber;
	public FlightNotDeletedException() {
		super();
	}
	public FlightNotDeletedException(int flightNumber) {
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
