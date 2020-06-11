package com.cg.bookingservice.flightmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;
import com.cg.bookingservice.flightmanagementsystem.repository.BookingRepository;

public class BookingImpl implements BookingService{
	@Autowired
	private BookingRepository bookingRepo;

	@Override
	public Booking addNewBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepo.save(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepo.findAll();
	}

	@Override
	public Booking getBookingByBookingId(long bookingId) {
		// TODO Auto-generated method stub
		return bookingRepo.findById(bookingId).get();
	}

	@Override
	public List<Booking> updateBookingByBookingId(long bookingId, Booking booking) {
		// TODO Auto-generated method stub
		Booking temp = null;
		List<Booking> tempList = bookingRepo.findAllById(bookingId);
		for(int i=0;i<tempList.size();i++) {
			temp = tempList.get(i);
			temp.setBookingId(booking.getBookingId());
			temp.setBookingDate(booking.getBookingDate());
			temp.setNoOfPassengers(booking.getNoOfPassengers());
			temp.setFlightId(booking.getFlightId());
		}
		return bookingRepo.findAllById(bookingId);
	}

	@Override
	public Booking cancelingBookingByBookingId(long bookingId) {
		// TODO Auto-generated method stub
		Booking temp = bookingRepo.deleteById(bookingId);
		return bookingRepo.save(temp);
	}

}
