package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DtoLayer.Airport;
import com.cg.FlightManagement.Exception.AirportCodeNotFoundException;
import com.cg.FlightManagement.Exception.AirportNotFoundException;

public interface AirportService {

	public List<Airport> viewAirport() throws AirportNotFoundException;
	public Airport viewAirportByCode(String airportCode) throws AirportCodeNotFoundException;

}
