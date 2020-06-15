package com.cg.ScheduleService.FlightManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
	Optional<Schedule> findByRouteId(long routeId);
	
}
