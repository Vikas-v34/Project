package com.cg.bookingservice.flightmanagementsystem.service;

import java.util.List;

import com.cg.bookingservice.flightmanagementsystem.entity.Flight;

public interface BookingService {
	Flight addNewBooking(Flight booking);
	List<Flight> getAllBooking();
	Flight getBookingByBookingId(long bookingId);
	List<Flight> updateBookingByBookingId(long bookingId,Flight booking);
	Flight cancelingBookingByBookingId(long bookingId);
}
