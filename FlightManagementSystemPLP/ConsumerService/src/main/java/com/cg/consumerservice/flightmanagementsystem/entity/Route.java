package com.cg.consumerservice.flightmanagementsystem.entity;

import java.sql.Time;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Route {
	
	private long routeId;
	private String sourceAirport;
	private String destinationAirport;
	private Time arrivalTime;
	private Time departureTime;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfJourney;
	public Route() {
		super();
	}
	public Route(long routeId, String sourceAirport, String destinationAirport, Time arrivalTime, Time departureTime,
			Date dateOfJourney) {
		super();
		this.routeId = routeId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.dateOfJourney = dateOfJourney;
	}
	public long getRouteId() {
		return routeId;
	}
	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	
	
	
}
