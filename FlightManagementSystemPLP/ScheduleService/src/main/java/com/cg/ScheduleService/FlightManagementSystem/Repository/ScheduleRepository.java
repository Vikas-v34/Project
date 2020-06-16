package com.cg.ScheduleService.FlightManagementSystem.Repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
	Optional<Schedule> findByRouteId(long routeId);
	@Transactional
	@Modifying
	Schedule deleteByFlightId(long flightId);
	
}
