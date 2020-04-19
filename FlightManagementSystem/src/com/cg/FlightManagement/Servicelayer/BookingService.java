package com.cg.FlightManagement.Servicelayer;
import java.util.List;
import com.cg.FlightManagement.DtoLayer.Booking;


public interface BookingService {
	public void addBooking(Booking b)throws Exception ;
	public List<Booking> viewBookingById(int bookingId)throws Exception;
	public List<Booking> viewBooking()throws Exception ;
	public boolean deleteBooking(int bookingId)throws Exception;

}
