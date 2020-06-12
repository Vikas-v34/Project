package com.cg.ScheduleService.FlightManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;
import com.cg.ScheduleService.FlightManagementSystem.Exception.FlightNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Exception.RouteNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Service.ScheduleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/scheduleCtrl")
public class ScheduleController {
	@Autowired(required=true)
	ScheduleService schdlser;

	@GetMapping("/flightdetails")
	public List<Schedule> getAllFlightsandRoutes() {
		return schdlser.getAllFlightsandRoutes();
	}

	@GetMapping("/flightdetails/{flightid}")
	@HystrixCommand(fallbackMethod = "invalidflightId")
	public Schedule getByFlightId(@PathVariable("flightid") long flightid) throws FlightNotFoundException {

		return schdlser.getByFlightId(flightid);

	}

	@GetMapping("/flightdetails/{routeid}")
	@HystrixCommand(fallbackMethod = "invalidrouteId")
	public Schedule getByRouteId(@PathVariable("routeid") long routeid) throws RouteNotFoundException {

		return schdlser.getByRouteId(routeid);

	}

	Schedule invalidflightId(@PathVariable("flightId") long flightId) {
		return new Schedule();
	}

	Schedule invalidrouteId(@PathVariable("routeId") long routeId) {
		return new Schedule();
	}
}
