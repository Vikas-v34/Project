package com.cg.ScheduleService.FlightManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;
import com.cg.ScheduleService.FlightManagementSystem.Exception.FlightNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Exception.RouteNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Repository.ScheduleRepository;

@Service
public abstract class ScheduleImpl implements ScheduleService {
	@Autowired
	ScheduleRepository schdlrepo;

	public List<Schedule> getAllFlightsandRoutes() {
		return schdlrepo.findAll();
	}

	public Schedule getByFlightId(Long flightid) throws FlightNotFoundException {
		Optional<Schedule> optflight = schdlrepo.findById(flightid);
		if (optflight.isPresent()) {
			return optflight.get();
		} else {
			throw new FlightNotFoundException("Flight not found for given flightid");
		}
	}

	public Schedule getByRouteId(Long routeid) throws RouteNotFoundException {
		Optional<Schedule> optflight = schdlrepo.findById(routeid);
		if (optflight.isPresent()) {
			return optflight.get();
		} else {
			throw new RouteNotFoundException("Route not found for given routeid");
		}

	}

}
