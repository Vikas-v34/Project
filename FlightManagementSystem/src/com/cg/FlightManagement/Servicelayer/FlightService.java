package com.cg.FlightManagement.Servicelayer;

import com.cg.FlightManagement.DtoLayer.Flight;

public interface FlightService {
	public boolean addFlight(Flight flight);
	public boolean deleteFlight(int flightNumber);
	public boolean showFlight(int flightNumber);
}
