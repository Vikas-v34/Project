package com.cg.bookingservice.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

	List<Booking> findAllByBookingId(long bookingId);
	Booking deleteByBookingId(long bookingId);
	

}
