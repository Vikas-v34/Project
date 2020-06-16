package com.cg.consumerservice.flightmanagementsystem.service;

import com.cg.consumerservice.flightmanagementsystem.entity.Flight;
import com.cg.consumerservice.flightmanagementsystem.entity.Route;
import com.cg.consumerservice.flightmanagementsystem.entity.Schedule;

public interface AdminService {

	Flight addNewFlight(Flight flight);
	Flight deleteFlight(Flight flight) ;
	
	Route addNewRoute(Route route);
	Route updateRouteById(long routeId,Route route);
	
	Schedule scheduleFlight(Schedule schedule);
	Schedule removeFlightFromSchedule(long flightId);

}
