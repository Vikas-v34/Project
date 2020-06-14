package com.cg.flightservice.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{
	
}
