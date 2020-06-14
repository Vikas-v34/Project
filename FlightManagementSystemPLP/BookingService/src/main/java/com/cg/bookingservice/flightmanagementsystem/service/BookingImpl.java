package com.cg.bookingservice.flightmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookingservice.flightmanagementsystem.entity.Flight;
import com.cg.bookingservice.flightmanagementsystem.repository.BookingRepository;

@Service
public class BookingImpl implements BookingService{
	@Autowired
    BookingRepository bookingRepo;

	@Override
	public Flight addNewBooking(Flight booking) {
		// TODO Auto-generated method stub
		return bookingRepo.save(booking);
	}

	@Override
	public List<Flight> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepo.findAll();
	}

	@Override
	public Flight getBookingByBookingId(long bookingId) {
		// TODO Auto-generated method stub
		return bookingRepo.findById(bookingId).get();
	}

	@Override
	public List<Flight> updateBookingByBookingId(long bookingId, Flight booking) {
		// TODO Auto-generated method stub
		Flight temp = null;
		List<Flight> tempList = bookingRepo.findAllByBookingId(bookingId);
		for(int i=0;i<tempList.size();i++) {
			temp = tempList.get(i);
			temp.setBookingId(booking.getBookingId());
			temp.setBookingDate(booking.getBookingDate());
			temp.setNoOfPassengers(booking.getNoOfPassengers());
			temp.setFlightId(booking.getFlightId());
		}
		return bookingRepo.findAllByBookingId(bookingId);
	}

	@Override
	public Flight cancelingBookingByBookingId(long bookingId) {
		// TODO Auto-generated method stub
		Flight temp = bookingRepo.deleteByBookingId(bookingId);
		return bookingRepo.save(temp);
	}

}
