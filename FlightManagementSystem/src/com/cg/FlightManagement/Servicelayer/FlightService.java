package com.cg.FlightManagement.Servicelayer;

import com.cg.FlightManagement.DtoLayer.Flight;
import com.cg.FlightManagement.Exception.FlightNotAddedException;
import com.cg.FlightManagement.Exception.FlightNotDeletedException;
import com.cg.FlightManagement.Exception.FlightNotFoundException;

public interface FlightService {
	public boolean addFlight(Flight flight) throws FlightNotAddedException;
	public boolean deleteFlight(int flightNumber) throws FlightNotDeletedException ;
	public boolean showFlight(int flightNumber) throws FlightNotFoundException;
}
