package com.cg.bookingservice.flightmanagementsystem.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="booking")
public class Booking {
	
	public Booking(long bookingId, long userId, Date bookingDate, long ticketCost, long noOfPassengers, long flightId) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.ticketCost = ticketCost;
		this.noOfPassengers = noOfPassengers;
		this.flightId = flightId;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private long bookingId;
	@Column(name="user_id")
	private long userId;
	@Column(name="booking_date")
	private Date bookingDate;
	@Column(name="ticket_cost")
	private long ticketCost;
	@Column(name="no_of_passengers")
	private long noOfPassengers;
	@Column(name="flight_id")
	private long flightId;
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public long getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(long ticketCost) {
		this.ticketCost = ticketCost;
	}
	public long getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(long noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", ticketCost=" + ticketCost + ", noOfPassengers=" + noOfPassengers + ", flightId=" + flightId + "]";
	}
	
}
