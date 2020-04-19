package com.cg.FlightManagement.DaoLayer;

import java.util.List;

import com.cg.FlightManagement.DtoLayer.Airport;

public interface AirportDao {
<<<<<<< HEAD
	public List<Airport> viewAirport() throws AirportNotFoundException;

	public Airport viewAirportByCode(String airportCode) throws AirportCodeNotFoundException;
=======
	public List<Airport> viewAirport() throws Exception;
	public Airport viewAirportByCode(String airportCode) throws Exception;
>>>>>>> branch 'master' of https://github.com/Vikas-v34/Project.git
}
