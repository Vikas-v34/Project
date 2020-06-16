package com.cg.consumerservice.flightmanagementsystem.entity;

public class Flight {

	private long flightId;
	private String carrierName;
	private String flightModel;
	private long seatCapacity;
	public Flight() {
		super();
	}
	public Flight(long flightId, String carrierName, String flightModel, long seatCapacity) {
		super();
		this.flightId = flightId;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public long getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	
	
	
}
