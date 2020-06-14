package com.cg.bookingservice.flightmanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookingservice.flightmanagementsystem.entity.Flight;
import com.cg.bookingservice.flightmanagementsystem.service.BookingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableDiscoveryClient
@RequestMapping("/bookingControl")
public class BookingController {
	@Autowired
	BookingService bookingsrvce;
	
	
	//To add a new Booking
	@PostMapping("/create")
	Flight newBooking(@RequestBody Flight booking) {
		return bookingsrvce.addNewBooking(booking);
	}
	
	//To get All Bookings
	//http://localhost:9092/bookingControl/getAll
	@GetMapping("/getAll")
	List<Flight> getAllBooking(){
		return bookingsrvce.getAllBooking();
	}
		
	//To get Booking by Booking Id
	//http://localhost:9092/bookingControl/getById/1001
	@GetMapping("/getById/{bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookingId")
	Flight getBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.getBookingByBookingId(bookId);
	}
	
	//To Update By Booking Id
	//http://localhost:9092/bookingControl/updateBooking/1001
	@PutMapping("/updateBooking/{bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookId")
		List<Flight> updateBookingByBookingId(@PathVariable("bookId")long bookId,@RequestBody Flight booking){
			return bookingsrvce.updateBookingByBookingId(bookId, booking);
	} 
	
	
	//To Cancel a Booking
	//http://localhost:9092/bookingControl/cancelBooking
	@PutMapping("/cancelBooking/{bookId}")
	Flight cancelingBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.cancelingBookingByBookingId(bookId);
	}
	
	//http://localhost:9092/bookingControl/getById/1009
	public Flight invalidBookingId(long bookId) {
		return  new Flight(10l,10l,null,0l,0l,0l);
	}
	
	//http://localhost:9092/bookingControl/updateBooking/1009
	public List<Flight> invalidBookId(long bookId,Flight booking){
		List<Flight> list = new ArrayList<Flight>();
		return list;
	}
	
}
