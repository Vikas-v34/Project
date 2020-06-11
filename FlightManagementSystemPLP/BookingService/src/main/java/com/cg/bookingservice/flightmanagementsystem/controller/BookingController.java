package com.cg.bookingservice.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;
import com.cg.bookingservice.flightmanagementsystem.service.BookingService;

@RestController
@RequestMapping(value="/bookingControl")
public class BookingController {
	@Autowired
	BookingService bookingsrvce;
	
	
	//To add a new Booking
	@PostMapping(value ="/create",consumes = MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json",produces= MediaType.APPLICATION_JSON_VALUE)
	Booking newBooking(@RequestBody Booking booking) {
		return bookingsrvce.addNewBooking(booking);
	}
	
	//To get All Bookings
	@GetMapping(value="/getAll",produces= MediaType.APPLICATION_JSON_VALUE)
	List<Booking> getAllBookings(){
		return bookingsrvce.getAllBooking();
	}
		
	//To get Booking by Booking Id
	@GetMapping(value="/getById/bookingId= {bookId}",produces= MediaType.APPLICATION_JSON_VALUE)
	Booking getBookingByBookingId(@PathVariable("bookId")Long bookId) {
		return bookingsrvce.getBookingByBookingId(bookId);
	}
	
	//To Update By Booking Id
	@PutMapping(value="/updateBooking/bookingId= {bookId}",consumes =  MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json",produces= MediaType.APPLICATION_JSON_VALUE)
		List<Booking> updateBookingByBookingId(@PathVariable("bookId")long bookId,@RequestBody Booking booking){
			return bookingsrvce.updateBookingByBookingId(bookId, booking);
	} 
	
	
	//To Cancel a Booking
	@PutMapping(value="/cancelBooking/bookId= {bookId}",consumes =  MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json",produces =  MediaType.APPLICATION_JSON_VALUE)
	Booking cancelingBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.cancelingBookingByBookingId(bookId);
	}
}
