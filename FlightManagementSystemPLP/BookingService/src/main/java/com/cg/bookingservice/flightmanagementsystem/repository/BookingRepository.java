package com.cg.bookingservice.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookingservice.flightmanagementsystem.entity.Flight;

@Repository
public interface BookingRepository extends JpaRepository<Flight, Long>{

	List<Flight> findAllByBookingId(long bookingId);
	Flight deleteByBookingId(long bookingId);
	

}
