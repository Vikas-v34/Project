package com.cg.FlightManagement.DtoLayer;

import java.util.ArrayList;

public class Flight {
	private int flightNumber;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	ArrayList<Object> arr = new ArrayList<>();
	public Flight(String flightModel, String carrierName, int seatCapacity, int flightNumber) {
		// TODO Auto-generated constructor stub
		super();
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.flightNumber = flightNumber;
		this.seatCapacity = seatCapacity;
		this.arr.add(flightModel);
		this.arr.add(carrierName);
		this.arr.add(seatCapacity);
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName
				+ ", seatCapacity=" + seatCapacity + "]";
	}
	
}
