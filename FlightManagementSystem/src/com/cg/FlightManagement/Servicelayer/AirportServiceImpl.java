package com.cg.FlightManagement.Servicelayer;

import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.DaoLayer.AirportDaoImpl;
import com.cg.FlightManagement.DtoLayer.Airport;
import com.cg.FlightManagement.Exception.AirportCodeNotFoundException;
import com.cg.FlightManagement.Exception.AirportNotFoundException;

public class AirportServiceImpl implements AirportService {
	List<Airport> airportList = new ArrayList<Airport>();
	AirportDaoImpl adi = new AirportDaoImpl();

	@Override
	public List<Airport> viewAirport() throws AirportNotFoundException {
		try {
			return adi.viewAirport();
		} catch (AirportNotFoundException e) {
			throw e;
		}
	}

	@Override
	public Airport viewAirportByCode(String airportCode) throws AirportCodeNotFoundException {
		try {
			return adi.viewAirportByCode(airportCode);
		} catch (AirportCodeNotFoundException e) {
			throw e;
		}
	}
}

/*
 * public class AirportServiceImpl{ public void viewAirport(){ //: List<Airport>
 * :-Returns the list of all airports. } public void viewAirport(String String){
 * //Error in class(String String) //: Airport :-Returns the details of an
 * airport identifiable by the } }
 */