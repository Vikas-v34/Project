package com.cg.FlightManagement.DaoLayer;
import java.util.List;

import com.cg.FlightManagement.DtoLayer.Booking;

public interface BookingDao {
	
		public void addBooking(Booking b) throws BookingNotAddedException;
		public List<Booking> viewBookingById(int bookingId) throws BookingIdNotFoundException;
		public List<Booking> viewBooking() throws BookingNotFoundException;
		public boolean deleteBooking(int bookingId) throws BookingNotDeletedException;
	}


