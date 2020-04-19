package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DaoLayer.BookingDaoImpl;
import com.cg.FlightManagement.DtoLayer.Booking;
import com.cg.FlightManagement.Exception.BookingIdNotFoundException;
import com.cg.FlightManagement.Exception.BookingNotAddedException;
import com.cg.FlightManagement.Exception.BookingNotDeletedException;
import com.cg.FlightManagement.Exception.BookingNotFoundException;

public class BookingServiceImpl implements BookingService{
	BookingDaoImpl bdi=new BookingDaoImpl();
	@Override
	public void addBooking(Booking b) throws BookingNotAddedException{
		// TODO Auto-generated method stub
	}

	@Override
	public List<Booking> viewBookingById(int bookingId) throws BookingIdNotFoundException {
		return bdi.viewBookingById(bookingId);
	}

	@Override
	public List<Booking> viewBooking() throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return bdi.viewBooking();
	}

	@Override
	public boolean deleteBooking(int bookingId) throws BookingNotDeletedException {
		return bdi.deleteBooking(bookingId);
	}
}
