package com.cg.flightservice.flightmanagementsystem.service;

import java.util.List;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;

public interface FlightService {

	Flight addFlight(Flight flight);

	Flight getByFlightId(long flightId);

	List<Flight> getAll();

	Flight deleteFlightByFlightId(long flightId);

	List<Flight> updateFlightByFlightId(long flightId, Flight flight);

	Flight getByCarrierName(String carrierName) throws Exception;

	
}
