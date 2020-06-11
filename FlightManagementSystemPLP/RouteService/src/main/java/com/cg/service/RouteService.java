package com.cg.service;

import java.util.Date;
import java.util.List;

import com.cg.entity.Route;

public interface RouteService {

	List<Route> searchRouteForSourceDestionAndDateOFJouney(String sourceAirport,String destinationAirport,Date dateOfJourney);
	List<Route> getAllRoutes();
}
