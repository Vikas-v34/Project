package com.cg.ScheduleService.FlightManagementSystem.Service;
 

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ScheduleService.FlightManagementSystem.Entity.Schedule;
import com.cg.ScheduleService.FlightManagementSystem.Exception.FlightNotFoundException;
import com.cg.ScheduleService.FlightManagementSystem.Exception.RouteNotFoundException;
 
@Service
public interface ScheduleService {
    
 
    public List<Schedule> getAllFlightsandRoutes();
 
    public Schedule getByFlightId(long flightid) throws FlightNotFoundException ;
 
    public Schedule getByRouteId(long routeid)throws RouteNotFoundException ;
    
 
    
    
    
}