package servicelayer;


import daoLayer.FlightDaoImpl;
import dtoLayer.Flight;

public class FlightServiceImpl {
	private FlightDaoImpl dao = new FlightDaoImpl();
	boolean result;
	public FlightServiceImpl() {
		super();
	}
	public boolean addFlight(Flight flight){
		result = dao.addFlightDao(flight);
		return result;
	}
	public boolean deleteFlight(long flightNumber) {
		result = dao.deleteFlight(flightNumber);
		return result;
	}

}
