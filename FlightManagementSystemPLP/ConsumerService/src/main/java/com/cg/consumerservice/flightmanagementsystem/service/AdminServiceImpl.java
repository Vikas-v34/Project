package com.cg.consumerservice.flightmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.consumerservice.flightmanagementsystem.entity.Flight;
import com.cg.consumerservice.flightmanagementsystem.entity.Route;
import com.cg.consumerservice.flightmanagementsystem.entity.Schedule;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	RestTemplate restTemplate;
	
	public RestTemplate getRestTemplet() {
		return restTemplate;
	}
	
	
	

	@Override
	public Flight addNewFlight(Flight flight) {
		Flight savedFlight = restTemplate.postForObject("http://Flight-Service/flightControl/create", flight, Flight.class);
		return savedFlight;
	}
	@Override
	public Route addNewRoute(Route route) {
		Route savedRoute = restTemplate.postForObject("http://route-service/routeCtrl/create", route, Route.class);
		return savedRoute;
	}
	@Override
	public Schedule scheduleFlight(Schedule schedule) {
		Schedule savedSchedule = restTemplate.postForObject("http://Schedule-service/scheduleCtrl/create", schedule, Schedule.class);
		return savedSchedule;
	}




	@Override
	public Flight deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Route updateRouteById(long routeId, Route route) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Schedule removeFlightFromSchedule(long flightId) {
		// TODO Auto-generated method stub
		return null;
	}

}
