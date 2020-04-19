package com.cg.FlightManagement.Exception;

public class AirportNotFoundException extends Exception{
	private String airportName;
	public AirportNotFoundException() {
		super();
	}
	public AirportNotFoundException(String airportCode) {
		super();
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return airportName + "Airport does not exist";
	}
	@Override
	public String getMessage() {
		return airportName + "Airport Name does not exist";
	}
	

}
