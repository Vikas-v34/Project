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

//	http://localhost:9091/scheduleCtrl/flightId
	@GetMapping("/flightId")
	public List<Schedule> getAllFlightsandRoutes() {
		return schdlser.getAllFlightsandRoutes();
	}
//	http://localhost:9091/scheduleCtrl/flightId/1001
	@GetMapping("/flightId/{flightid}")
	@HystrixCommand(fallbackMethod = "invalidflightId")
	public Schedule getByFlightId(@PathVariable long flightid) throws FlightNotFoundException {

		return schdlser.getByFlightId(flightid);

	}
//	http://localhost:9091/scheduleCtrl/routeId/101
	@GetMapping("/routeId/{routeid}")
	@HystrixCommand(fallbackMethod = "invalidrouteId")
	public Schedule getByRouteId(@PathVariable("routeid") long routeid) throws RouteNotFoundException {
		/*
		 * System.out.println(routeid);
		 * System.out.println(schdlser.getByRouteId(routeid));
		 */
		return schdlser.getByRouteId(routeid);

	}

	//public Schedule invalidflightId(@PathVariable("flightId") long flightId) {
	public Schedule invalidflightId(long flightId) {
		return new Schedule(0l,0l);
	}

	//public Schedule invalidrouteId(@PathVariable("routeId") long routeId) {
	public Schedule invalidrouteId(long routeId) {
	return new Schedule();
	}
}
