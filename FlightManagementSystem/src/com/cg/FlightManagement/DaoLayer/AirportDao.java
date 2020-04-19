package com.cg.FlightManagement.DaoLayer;

import java.util.List;

import com.cg.FlightManagement.DtoLayer.Airport;

public interface AirportDao {

	public List<Airport> viewAirport() throws AirportNotFoundException;

	public Airport viewAirportByCode(String airportCode) throws AirportCodeNotFoundException;

}
