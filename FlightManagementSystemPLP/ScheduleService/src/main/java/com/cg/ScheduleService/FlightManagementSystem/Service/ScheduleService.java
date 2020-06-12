package com.cg.ScheduleService.FlightManagementSystem.Service;

import java.util.List;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;

public interface ScheduleService {
	Schedule getByFlightId(long flightid);

	Schedule getByRouteId(long routeid);

	List<Schedule> getAllFlightsandRoutes();
	//xkfsdkllfjsda

}