package com.cg.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
	List<Route> findAllBySourceAirportAndDestinationAirportAndDateOfJourney(String sourceAirport,String destinationAirport,Date dateOfJourney);
    
}
