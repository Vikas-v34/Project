package com.cg.consumerservice.flightmanagementsystem.service;

import com.cg.consumerservice.flightmanagementsystem.entity.Booking;

public interface UserService {
	
	Booking addBooking(Booking booking);
	Booking deleteBooking(long bookingId);

}
