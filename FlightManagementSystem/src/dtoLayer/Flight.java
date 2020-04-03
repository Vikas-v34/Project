package dtoLayer;

import java.util.ArrayList;

public class Flight {
	public long flightNumber;
	public String flightModel;
	public String carrierName;
	public int seatCapacity;
	ArrayList<Object> arr = new ArrayList<>();
	public Flight(String flightModel, String carrierName, int seatCapacity, long flightNumber) {
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
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
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
