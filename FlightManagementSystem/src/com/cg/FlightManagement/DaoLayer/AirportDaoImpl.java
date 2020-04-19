package com.cg.FlightManagement.DaoLayer;

import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.DtoLayer.Airport;
import com.cg.FlightManagement.Servicelayer.AirportService;

public class AirportDaoImpl implements AirportService{
	List<Airport> airportList = new ArrayList<Airport>();
	
	public List<Airport> viewAirport()throws AirportNotFoundException {
		try {
			return airportList;
		}
		catch(AirportNotFoundException e){
			throw e;
		}
	}

	@Override
	public Airport viewAirportByCode(String airportCode) throws AirportCodeNotFoundException {
			try {
			Airport result = airportList.stream().filter(n -> n.getAirportCode() == airportCode).findAny().orElse(null);
			return result;
		}
		catch(Exception e) {
			throw e;
		}
	}
}
