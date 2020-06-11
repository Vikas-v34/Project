package com.cg.bookingservice.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{
	

}
