package com.cg.service;

import java.util.Date;
import java.util.List;

import com.cg.entity.Route;
import com.cg.exception.RouteIdNotFoundException;

public interface RouteService {

	List<Route> searchRouteForSourceDestionAndDateOFJouney(String sourceAirport,String destinationAirport,Date dateOfJourney);
	List<Route> getAllRoutes();
	Route addNewRoute(Route route); 
	
	Route updateRouteByRouteId(long routeId,Route route) throws RouteIdNotFoundException;
}
