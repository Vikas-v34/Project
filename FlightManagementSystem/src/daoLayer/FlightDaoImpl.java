package daoLayer;

import java.util.ArrayList;
import java.util.HashMap;

import dtoLayer.Flight;

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
		public boolean deleteFlight(Integer flightNumber) {
			flightList.remove(flightNumber);
			return true;
		}
		public boolean deleteFlight(long flightNumber) {
			// TODO Auto-generated method stub
			return false;
		}
	}


