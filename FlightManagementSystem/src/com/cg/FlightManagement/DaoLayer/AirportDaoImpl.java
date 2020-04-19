package com.cg.FlightManagement.DaoLayer;

import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.DtoLayer.Airport;
import com.cg.FlightManagement.Exception.AirportCodeNotFoundException;
import com.cg.FlightManagement.Exception.AirportNotFoundException;

public class AirportDaoImpl implements AirportDao{
	List<Airport> airportList = new ArrayList<Airport>();
	
	public List<Airport> viewAirport()throws AirportNotFoundException {
		return airportList;
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
