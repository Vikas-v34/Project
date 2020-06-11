package com.cg.ScheduleService.FlightManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ScheduleService.FlightManagementSystem.Repository.ScheduleRepository;


@Service
public class ScheduleImpl implements ScheduleService{
	@Autowired
	ScheduleRepository Schdlerepo;
	
	
	
}
