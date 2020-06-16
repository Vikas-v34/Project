package com.cg.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Route;
import com.cg.exception.RouteIdNotFoundException;
import com.cg.repository.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	RouteRepository routeRepo;

	@Override
	public List<Route> searchRouteForSourceDestionAndDateOFJouney(String sourceAirport, String destinationAirport,
			Date dateOfJourney) {
		System.out.println(routeRepo.findAllBySourceAirportAndDestinationAirportAndDateOfJourney(sourceAirport,
				destinationAirport, dateOfJourney));
		return routeRepo.findAllBySourceAirportAndDestinationAirportAndDateOfJourney(sourceAirport, destinationAirport,
				dateOfJourney);
	}

	@Override
	public List<Route> getAllRoutes() {
		return routeRepo.findAll();
	}

	@Override
	public Route addNewRoute(Route route) {
		return routeRepo.save(route);
	}

	@Override
	public Route updateRouteByRouteId(long routeId, Route route) throws RouteIdNotFoundException {
		Route route1 = routeRepo.findById(routeId).orElse(null);
		if (route1 == null) {
			throw new RouteIdNotFoundException("Route Id Not Found");
		}
		route1.setSourceAirport(route.getSourceAirport());
		route1.setDestinationAirport(route.getDestinationAirport());
		route1.setArrivalTime(route.getArrivalTime());
		route1.setDepartureTime(route.getDepartureTime());
		route1.setDateOfJourney(route.getDateOfJourney());
		

		return routeRepo.save(route1);
	}

}
