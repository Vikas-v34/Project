package com.cg.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Route")
public class Route {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="source_airport")
private String sourceAirport;
@Column(name="destination_airport")
private String destinationAirport;
@Column(name="arrival_time")
private Time arrivalTime;
@Column(name="departure_time")
private Time departureTime;
@Column(name="flight_id")
private Long flightId;


public Route() {
	super();
}
public Route(String sourceAirport,String destinationAirport,Time arrivalTime, Time departureTime, Long flightId ) {
	super();
	this.sourceAirport= sourceAirport;
	this.destinationAirport = destinationAirport;
	this.arrivalTime = arrivalTime;
	this.departureTime = departureTime;
	this.flightId = flightId;
	
	
	
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
public Long getFlightId() {
	return flightId;
}
public void setFlightId(Long flightId) {
	this.flightId = flightId;
}
@Override
public String toString() {
	return "Route [sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", arrivalTime="
			+ arrivalTime + ", departureTime=" + departureTime + ", flightId=" + flightId + "]";
}




}
