package com.cg.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "route")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "route_id")
	private long routeId;
	@Column(name = "source_airport")
	private String sourceAirport;
	@Column(name = "destination_airport")
	private String destinationAirport;
	@Column(name = "arrival_time")
	private Time arrivalTime;
	@Column(name = "departure_time")
	private Time departureTime;
	@Column(name = "date_of_journey")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfJourney;

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", dateOfJourney=" + dateOfJourney + "]";
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

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

}
