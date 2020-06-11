package com.cg.ScheduleService.FlightManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;
import com.cg.ScheduleService.FlightManagementSystem.Exception.FlightNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Exception.RouteNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Service.ScheduleService;

public class ScheduleController {
	@Autowired
	ScheduleService schdlser;

	@GetMapping("/flightdetails")
	public List<Schedule> getAllFlightsandRoutes() {
		return schdlser.getAllFlightsandRoutes();
	}

	@GetMapping("/flightdetails/{flightid}")
	public Schedule getByFlightId(@PathVariable("flightid") long flightid) throws FlightNotFoundException {

		return schdlser.getByFlightId(flightid);

	}

	@GetMapping("/flightdetails/{routeid}")
	public Schedule getByRouteId(@PathVariable("routeid") long routeid) throws RouteNotFoundException {

		return schdlser.getByRouteId(routeid);

	}
}
