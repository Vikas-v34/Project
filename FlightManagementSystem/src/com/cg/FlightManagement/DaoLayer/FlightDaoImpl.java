package com.cg.FlightManagement.DaoLayer;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.FlightManagement.DtoLayer.Flight;

public class FlightDaoImpl {
	private HashMap<Integer,ArrayList<Object>> flightList = new HashMap<>(); 
	private ArrayList<Object> frr = new ArrayList<>();
	
	public FlightDaoImpl() {
		super();
	}
		public boolean addFlightDao (Flight flight) {
			frr.add(flight.getSeatCapacity());
			frr.add(flight.getFlightModel());
			frr.add(flight.getCarrierName());
			flightList.put((int) flight.getFlightNumber(),frr);
			
			return true;
		}
		public boolean deleteFlight(int flightNumber) {
			flightList.remove(flightNumber);
			
			return true;
		}
		public boolean showFlight(int flightNumber) {
			System.out.println(frr);
			return true;
		}

	}


