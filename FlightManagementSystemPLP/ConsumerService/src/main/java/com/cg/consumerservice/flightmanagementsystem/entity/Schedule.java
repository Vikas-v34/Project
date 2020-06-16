package com.cg.consumerservice.flightmanagementsystem.entity;

public class Schedule {
	

	private long flightId;
	private long routeId;
	public Schedule() {
		super();
	}
	public Schedule(long flightId, long routeId) {
		super();
		this.flightId = flightId;
		this.routeId = routeId;
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
	

}
