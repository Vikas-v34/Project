package com.cg.ScheduleService.FlightManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Schedule")
public class Schedule {
	
	@Id
	@Column(name="flight_Id")
	private long flightId;
	@Column(name="route_Id")
	private long routeId;

	public Schedule(long flightId, long routeId) {
		super();
		this.flightId = flightId;
		this.routeId = routeId;
	}

	public Schedule() {
		super();
		
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public long getRouteId() {
		return routeId;
	}

	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "Schedule [flightId=" + flightId + ", routeId=" + routeId + "]";
	}

}