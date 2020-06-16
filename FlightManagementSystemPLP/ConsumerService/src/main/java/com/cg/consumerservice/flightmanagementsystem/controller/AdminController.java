package com.cg.consumerservice.flightmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.consumerservice.flightmanagementsystem.entity.Flight;
import com.cg.consumerservice.flightmanagementsystem.entity.Route;
import com.cg.consumerservice.flightmanagementsystem.entity.Schedule;
import com.cg.consumerservice.flightmanagementsystem.service.AdminService;

@RestController
@RequestMapping("/adminCtrl")
public class AdminController {

	@Autowired
	AdminService adminService;
//	----------------------------------------------------------------------------------------------
//	--------------------------------Create-----------------------------------------------------
	//to Add new Flight to flight table
//		http://localhost:8888/adminCtrl/addFlight
		@PostMapping("/addFlight")
		ResponseEntity<Flight> addFlight(@RequestBody Flight flight ){
			Flight savedFight = adminService.addNewFlight(flight);
			return new ResponseEntity<Flight>(savedFight, HttpStatus.OK);
		}
		
		//to Add new Route to Route table
//		http://localhost:8888/adminCtrl/addFlight
		@PostMapping("/addRoute")
		ResponseEntity<Route> addRoute(@RequestBody Route route ){
			Route savedRoute = adminService.addNewRoute(route);
			return new ResponseEntity<Route>(savedRoute, HttpStatus.OK);
		}
		
		//schedule flight
//		http://localhost:8888/adminCtrl/addFlight
		@PostMapping("/schedule")
		ResponseEntity<Schedule> scheduleFlight(@RequestBody Schedule schedule ){
			Schedule savedSchedule = adminService.scheduleFlight(schedule);
			return new ResponseEntity<Schedule>(savedSchedule, HttpStatus.OK);
		}
		

//		----------------------------------------------------------------------------------------------
//		--------------------------------Update -----------------------------------------------------
		
//		@PutMapping()
		
		@GetMapping("/")
		String m() {
		return "Hii";	
		}
		
//		----------------------------------------------------------------------------------------------
//		--------------------------------Delete -----------------------------------------------------	
		
		
}
