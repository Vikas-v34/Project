package com.cg.bookingservice.flightmanagementsystem.controller;

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

import com.cg.bookingservice.flightmanagementsystem.entity.Booking;
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
	Booking newBooking(@RequestBody Booking booking) {
		return bookingsrvce.addNewBooking(booking);
	}
	
	//To get All Bookings
	//http://localhost:9092/bookingControl/getAll
	@GetMapping("/getAll")
	List<Booking> getAllBooking(){
		return bookingsrvce.getAllBooking();
	}
		
	//To get Booking by Booking Id
	//http://localhost:9092/bookingControl/getById/1001
	@GetMapping("/getById/{bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookingId")
	Booking getBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.getBookingByBookingId(bookId);
	}
	
	//To Update By Booking Id
	//http://localhost:9092/bookingControl/updateBooking/1001
	@PutMapping("/updateBooking/{bookId}")
	@HystrixCommand(fallbackMethod = "invalidBookId")
		List<Booking> updateBookingByBookingId(@PathVariable("bookId")long bookId,@RequestBody Booking booking){
			return bookingsrvce.updateBookingByBookingId(bookId, booking);
	} 
	
	
	//To Cancel a Booking
	//http://localhost:9092/bookingControl/cancelBooking
	@PutMapping("/cancelBooking/{bookId}")
	Booking cancelingBookingByBookingId(@PathVariable("bookId")long bookId) {
		return bookingsrvce.cancelingBookingByBookingId(bookId);
	}
	
	//http://localhost:9092/bookingControl/getById/1009
	public Booking invalidBookingId(long bookId) {
		return  new Booking(10l,10l,null,0l,0l,0l);
	}
	
	//http://localhost:9092/bookingControl/updateBooking/1009
	public List<Booking> invalidBookId(long bookId){
		List<Booking> list = null;
		return list;
	}
	
}
