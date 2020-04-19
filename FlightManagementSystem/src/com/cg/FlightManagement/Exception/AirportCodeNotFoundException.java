package com.cg.FlightManagement.Exception;

public class AirportCodeNotFoundException extends Exception{
	private String airportCode;
	public AirportCodeNotFoundException() {
		super();
	}
	public AirportCodeNotFoundException(String airportCode) {
		super();
		this.airportCode = airportCode;
	}
	@Override
	public String toString() {
		return airportCode + "This Airport Code does not exist";
	}
	@Override
	public String getMessage() {
		return airportCode + "This Airport Code does not exist";
	}
	
}
