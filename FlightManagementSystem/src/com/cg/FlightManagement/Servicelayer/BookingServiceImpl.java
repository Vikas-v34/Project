package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DaoLayer.BookingDaoImpl;
import com.cg.FlightManagement.DtoLayer.Booking;

public class BookingServiceImpl implements BookingService{
	BookingDaoImpl bdi=new BookingDaoImpl();
	@Override
	public void addBooking(Booking b) throws Exception{
		// TODO Auto-generated method stub
		try {
			bdi.addBooking(b);
		}
		catch(Exception e){
			throw e;
		}
	}

	@Override
	public List<Booking> viewBookingById(int bookingId) throws Exception {
		// TODO Auto-generated method stub
		try {
			return bdi.viewBookingById(bookingId);
		}
		catch(Exception e){
			throw e;
		}
	}

	@Override
	public List<Booking> viewBooking() throws Exception {
		// TODO Auto-generated method stub
		try {
			return bdi.viewBooking();
		}
		catch(Exception e){
			throw e;
		}
	}

	@Override
	public boolean deleteBooking(int bookingId) throws Exception {
		// TODO Auto-generated method stub
		try {
			return bdi.deleteBooking(bookingId);
		}
		catch(Exception e){
			throw e;
		}
	}
}
