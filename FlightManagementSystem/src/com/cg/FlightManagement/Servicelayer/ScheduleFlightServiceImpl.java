package com.cg.FlightManagement.Servicelayer;

public class ScheduleFlightServiceImpl {
		public void scheduleFlight(String ScheduledFlight) {
		//: ScheduledFlight :-Schedules a flight alongwith its timings, locations and capacity
		}
		/*public void viewScheduledFlights(String Airport, int Airport,String LocalDate) {
			//: List<Scheduled Flight> :-Returns a list of flights between two airports on a specified date.
		}*/
		public void viewScheduledFlights(long flightNumber) {
		//:Flight :-Returns a list of a scheduled flight identifiable by flight number.
		}
		public void viewScheduledFlight() {
			//: List<ScheduledFlight> :-Shows all the details and status of all flights.
		}
		public void modifyScheduledFlight(String Flight,String Schedule,Integer flighNumber) {
			//: ScheduledFlight :-Modifies the details of a scheduled flight.
		}
		public void deleteScheduledFlight(long flightId) {
			//: void :-Removes a flight from the available flights.
		}
		public void validateScheduledFlight(String ScheduledFlight) {
			// void :-Validates the attributes of a scheduled Flight
		}
}
