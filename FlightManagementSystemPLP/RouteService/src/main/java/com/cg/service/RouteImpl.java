package com.cg.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Route;
import com.cg.repository.RouteRepository;

@Service
public class RouteImpl implements RouteService {

	@Autowired
	RouteRepository routeRepo;
	
	@Override
	public	List<Route> searchRouteForSourceDestionAndDateOFJouney(String sourceAirport,String destinationAirport,Date dateOfJourney)
	{
		System.out.println(routeRepo.findAllBySourceAirportAndDestinationAirportAndDateOfJourney(sourceAirport, destinationAirport, dateOfJourney));
		return routeRepo.findAllBySourceAirportAndDestinationAirportAndDateOfJourney(sourceAirport, destinationAirport, dateOfJourney);
	}
	
	@Override
	public	List<Route> getAllRoutes(){
		return routeRepo.findAll();
	}
	
}
