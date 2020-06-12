package com.cg.bookingservice.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;
import com.cg.bookingservice.flightmanagementsystem.service.BookingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/bookingControl")
public class BookingController {
	@Autowired
	BookingService bookingsrvce;
	
	
	//To add a new Booking
	@PostMapping("/create")
	Booking newBooking(@RequestBody Booking booking) {
		return bookingsrvce.addNewBooking(booking);
	}
	
	//To get All Bookings
	@GetMapping("/getAll")
	List<Booking> getAllBooking(){
		return bookingsrvce.getAllBooking();
	}
		
	//To get Booking by Booking Id
	@GetMapping("/getById/bookingId= {bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookingId")
	Booking getBookingByBookingId(@PathVariable("bookId")Long bookId) {
		return bookingsrvce.getBookingByBookingId(bookId);
	}
	
	//To Update By Booking Id
	@PutMapping("/updateBooking/bookingId= {bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookId")
		List<Booking> updateBookingByBookingId(@PathVariable("bookId")long bookId,@RequestBody Booking booking){
			return bookingsrvce.updateBookingByBookingId(bookId, booking);
	} 
	
	
	//To Cancel a Booking
	@PutMapping("/cancelBooking/bookId= {bookId}")
	Booking cancelingBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.cancelingBookingByBookingId(bookId);
	}
	
	Booking invalidBookingId(@PathVariable("bookId")long bookId) {
		return new Booking();
	}
	
	List<Booking> invalidBookId(@PathVariable("bookId")long bookId){
		List<Booking> list = null;
		return list;
	}
	
}
