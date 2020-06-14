package com.cg.flightservice.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;
import com.cg.flightservice.flightmanagementsystem.service.FlightService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableDiscoveryClient
@RequestMapping("/flightControl")
public class FlightController {
	@Autowired
	FlightService flightsrvce;
	
	
	@PostMapping("/create")
	Flight newFlight(@RequestBody Flight flight) {
		return flightsrvce.addFlight(flight);
	}
	
	@GetMapping("/getAll")
	List<Flight> getAll(){
		return flightsrvce.getAll();
	}
	
	@GetMapping("/getflightId")
	Flight getByFlightId(){
		return flightsrvce.getByFlightId(0l);
	}
		

	//To Update By Flight Id
	//http://localhost:9092/flightControl/updateFlight/1001
	@PutMapping("/updateFlight/{flightId}")
	@HystrixCommand(fallbackMethod = "invalidflightId")
		List<Flight> updateFlightByFlightId(@PathVariable("flightId")long flightId,@RequestBody Flight flight){
			return flightsrvce.updateFlightByFlightId(flightId, flight);
	} 
	
	
	//To Delete by Flight Id
	//http://localhost:9092/flightControl/deleteFlight/1001
	@PutMapping("/deleteFlight/{flightId}")
	@HystrixCommand(fallbackMethod = "invalidflightId")
	Flight deleteFlightByFlightId(@PathVariable("flightId")long flightId) {
		return flightsrvce.deleteFlightByFlightId(flightId);
	}
	
	//http://localhost:9092/bookingControl/getById/1009
	public Flight invalidflightId(long flightId) {
		return  new Flight(0l,null,null,0l);
	}
	
	/*
	 * //http://localhost:9092/bookingControl/updateBooking/1009 public
	 * List<Booking> invalidBookId(long bookId,Booking booking){ List<Booking> list
	 * = new ArrayList<Booking>(); return list; }
	 */
	
}
