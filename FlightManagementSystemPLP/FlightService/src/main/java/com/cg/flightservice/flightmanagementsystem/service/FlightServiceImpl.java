package com.cg.flightservice.flightmanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightservice.flightmanagementsystem.entity.Flight;
import com.cg.flightservice.flightmanagementsystem.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
    FlightRepository FlightRepo;

	@Override
	public Flight addFlight(Flight flight) {
		return FlightRepo.save(flight);
	}
	
	@Override
	public Flight getByFlightId(long flightId) {
		return FlightRepo.findById(flightId).get();
	}
	
	
	 @Override 
	 public Flight getByCarrierName(String carrierName) throws Exception { 
		 return FlightRepo.findByCarrierName(carrierName).orElseThrow(()-> new Exception()); 	 
	 }
	 
	@Override
	public List<Flight> getAll() {
		return FlightRepo.findAll();
	}

	

	@Override
	public List<Flight> updateFlightByFlightId(long flightId, Flight flight) {
		// TODO Auto-generated method stub
		Flight temp = null;
		List<Flight> tempList = FlightRepo.findAllByFlightId(flightId);
		for(int i=0;i<tempList.size();i++) {
			temp = tempList.get(i);
			temp.setCarrierName(flight.getCarrierName());
			temp.setFlightModel(flight.getFlightModel());
			temp.setSeatCapacity(flight.getSeatCapacity());
			}
		return FlightRepo.findAllByFlightId(flightId);
	}
	

	@Override
	public Flight deleteFlightByFlightId(long flightId) {
		// TODO Auto-generated method stub
		Flight temp = FlightRepo.deleteByFlightId(flightId);
		return FlightRepo.save(temp);
	}



}


