package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DaoLayer.BookingDaoImpl;
import com.cg.FlightManagement.DtoLayer.Booking;

public class BookingServiceImpl implements BookingService{
	BookingDaoImpl bdi=new BookingDaoImpl();
	@Override
	public void addBooking(Booking b) throws BookingNotAddedException{
		// TODO Auto-generated method stub
		try {
			bdi.addBooking(b);
		}
		catch(BookingNotAdded e){
			throw e;
		}
	}

	@Override
	public List<Booking> viewBookingById(int bookingId) throws BookingIdNotFoundException {
		// TODO Auto-generated method stub
		try {
			return bdi.viewBookingById(bookingId);
		}
		catch(BookingIdNotFoundException e){
			throw e;
		}
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
