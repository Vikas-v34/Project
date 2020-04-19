package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DtoLayer.Airport;

public interface AirportService {

	public List<Airport> viewAirport() throws Exception;
	public Airport viewAirportByCode(String airportCode) throws Exception;

}