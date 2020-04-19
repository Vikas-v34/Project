package com.cg.FlightManagement.Servicelayer;


import com.cg.FlightManagement.DaoLayer.FlightDaoImpl;
import com.cg.FlightManagement.DtoLayer.Flight;

public class FlightServiceImpl implements FlightService{
	private FlightDaoImpl dao = new FlightDaoImpl();
	boolean result;
	public FlightServiceImpl() {
		super();
	}
	public boolean addFlight(Flight flight){
		result = dao.addFlight(flight);
		return result;
	}
	public boolean deleteFlight(int flightNumber) {
		result = dao.deleteFlight(flightNumber);
		return result;
	}
	public boolean showFlight(int flightNumber) {
		result = dao.showFlight(flightNumber);
		return true;
	}

}
