package com.cg.FlightManagement.DaoLayer;

import com.cg.FlightManagement.DtoLayer.Flight;

public interface FlightDao {
	public boolean addFlight(Flight flight);
	public boolean deleteFlight(int flightNumber);
	public boolean showFlight(int flightNumber);
}
