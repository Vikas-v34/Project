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
@Column(name="airport_name")
private String airportName;
@Column(name="airport_location")
private String airortLocation;

public Route() {
	super();
}
public Route(String sourceAirport,String destinationAirport,Time arrivalTime, Time departureTime, String airportName, String airportLocation ) {
	super();
	this.sourceAirport= sourceAirport;
	this.destinationAirport = destinationAirport;
	this.arrivalTime = arrivalTime;
	this.departureTime = departureTime;
	this.airportName = airportName;
	this.airortLocation = airportLocation;
	
	
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
public String getAirportName() {
	return airportName;
}
public void setAirportName(String airportName) {
	this.airportName = airportName;
}
public String getAirortLocation() {
	return airortLocation;
}
public void setAirortLocation(String airortLocation) {
	this.airortLocation = airortLocation;
}
@Override
public String toString() {
	return "Route [sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", arrivalTime="
			+ arrivalTime + ", departureTime=" + departureTime + ", airportName=" + airportName + ", airortLocation="
			+ airortLocation + "]";
}



}
