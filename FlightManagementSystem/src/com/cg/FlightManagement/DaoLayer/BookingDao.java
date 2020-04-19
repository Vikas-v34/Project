package com.cg.FlightManagement.DaoLayer;
import java.util.List;

import com.cg.FlightManagement.DtoLayer.Booking;
import com.cg.FlightManagement.Exception.BookingIdNotFoundException;
import com.cg.FlightManagement.Exception.BookingNotAddedException;
import com.cg.FlightManagement.Exception.BookingNotDeletedException;
import com.cg.FlightManagement.Exception.BookingNotFoundException;

public interface BookingDao {
	
		public void addBooking(Booking b) throws BookingNotAddedException;
		public List<Booking> viewBookingById(int bookingId) throws BookingIdNotFoundException;
		public List<Booking> viewBooking() throws BookingNotFoundException;
		public boolean deleteBooking(int bookingId) throws BookingNotDeletedException;
	}


