package com.cg.FlightManagement.DaoLayer;
import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.DtoLayer.Booking;
import com.cg.FlightManagement.Exception.BookingIdNotFoundException;
import com.cg.FlightManagement.Exception.BookingNotAddedException;
import com.cg.FlightManagement.Exception.BookingNotDeletedException;
import com.cg.FlightManagement.Exception.BookingNotFoundException;

	public class BookingDaoImpl implements BookingDao {
		List<Booking> bookingList=new ArrayList<Booking>();

		@Override
		public void addBooking(Booking b) throws BookingNotAddedException {
			// TODO Auto-generated method stub
			bookingList.add(b);
		}

		@Override
		public List<Booking> viewBookingById(int bookingId) throws BookingIdNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Booking> viewBooking() throws BookingNotFoundException {
			// TODO Auto-generated method stub
			return bookingList;
		}

		@Override
		public boolean deleteBooking(int bookingId) throws BookingNotDeletedException {
			// TODO Auto-generated method stub
				boolean available=false;
				for(Booking b1:bookingList) {
					if(Booking.getBookingId()==bookingId) {
						bookingList.remove(b1);
						available=true;
						break;
					}
				}
				return available;
			
			
		}
	}


