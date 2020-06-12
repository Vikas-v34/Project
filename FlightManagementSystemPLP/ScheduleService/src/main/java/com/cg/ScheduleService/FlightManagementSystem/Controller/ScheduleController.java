package com.cg.ScheduleService.FlightManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
@EnableDiscoveryClient
public class ScheduleController {
	@Autowired(required=true)
	ScheduleService schdlser;

//	http://localhost:9091/scheduleCtrl/flightdetails
	@GetMapping("/flightdetails")
	public List<Schedule> getAllFlightsandRoutes() {
		return schdlser.getAllFlightsandRoutes();
	}

	@GetMapping("/flightId/{flightid}")
	@HystrixCommand(fallbackMethod = "invalidflightId",commandKey="vikasCommandKey",
			groupKey="vikasGroupKet")
	public Schedule getByFlightId(@PathVariable("flightid") long flightid) throws FlightNotFoundException {

		return schdlser.getByFlightId(flightid);

	}

	@GetMapping("/routeId/{routeid}")
	@HystrixCommand(fallbackMethod = "invalidrouteId" ,commandKey="vikasCommandKey",
			groupKey="vikasGroupKet")
	public Schedule getByRouteId(@PathVariable("routeid") long routeid) throws RouteNotFoundException {

		return schdlser.getByRouteId(routeid);

	}

	//public Schedule invalidflightId(@PathVariable("flightId") long flightId) {
	public Schedule invalidflightId(long flightId) {
		return new Schedule(0l,0l);
	}

	//public Schedule invalidrouteId(@PathVariable("routeId") long routeId) {
	public Schedule invalidrouteId(long routeId) {
	return new Schedule(0l,0l);
	}
}
