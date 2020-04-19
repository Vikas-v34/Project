package com.cg.FlightManagement.DaoLayer;

import com.cg.FlightManagement.DtoLayer.Flight;

public interface FlightDao {
	public boolean addFlight(Flight flight) throws FlightNotAddedException;
	public boolean deleteFlight(int flightNumber) throws FlightNotDeletedException;
	public boolean showFlight(int flightNumber) throws FlightNotFoundException;
}
