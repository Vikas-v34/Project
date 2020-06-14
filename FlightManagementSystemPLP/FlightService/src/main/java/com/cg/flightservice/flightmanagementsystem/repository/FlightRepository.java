package com.cg.flightservice.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

	List<Flight> findAllByFlightId(long flightId);

	Flight deleteByFlightId(long flightId);

	Flight findByCarrierName(String carrierName);
	
}
