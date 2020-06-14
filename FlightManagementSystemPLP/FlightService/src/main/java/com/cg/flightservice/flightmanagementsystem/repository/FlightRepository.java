package com.cg.flightservice.flightmanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{

	List<Flight> findAllByFlightId(long flightId);

	Flight deleteByFlightId(long flightId);

	Optional<Flight> findById(String carrierName);
	
}
