package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DaoLayer.BookingDaoImpl;
import com.cg.FlightManagement.DtoLayer.Booking;
import com.cg.FlightManagement.Exception.BookingIdNotFoundException;
import com.cg.FlightManagement.Exception.BookingNotAddedException;

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
		try {
			return bdi.viewBooking();
		}
		catch(BookingNotFoundException e){
			throw e;
		}
	}

	@Override
	public boolean deleteBooking(int bookingId) throws BookingNotDeletedException {
		// TODO Auto-generated method stub
		try {
			return bdi.deleteBooking(bookingId);
		}
		catch(BokingNotDeletedException e){
			throw e;
		}
	}
}
