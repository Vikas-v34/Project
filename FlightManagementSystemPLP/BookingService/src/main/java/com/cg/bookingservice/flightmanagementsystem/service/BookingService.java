package com.cg.bookingservice.flightmanagementsystem.service;

import java.util.List;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;

public interface BookingService {
	Booking addNewBooking(Booking booking);
	List<Booking> getAllBooking();
	Booking getBookingByBookingId(long bookingId);
	List<Booking> updateBookingByBookingId(long bookingId,Booking booking);
	Booking cancelingBookingByBookingId(long bookingId);
}
