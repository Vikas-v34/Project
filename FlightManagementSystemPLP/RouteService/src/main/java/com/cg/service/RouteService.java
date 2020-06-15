package com.cg.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.cg.entity.Route;

public interface RouteService {

	List<Route> searchRouteForSourceDestionAndDateOFJouney(String sourceAirport,String destinationAirport,LocalDate dateOfJourney);
	List<Route> getAllRoutes();
}
