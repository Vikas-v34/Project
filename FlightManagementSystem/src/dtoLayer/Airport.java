package dtoLayer;

public class Airport {
	public String airportName;
	public String airportCode;
	public String airportLocation;
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", airportCode=" + airportCode + ", airportLocation="
				+ airportLocation + "]";
	}
}
