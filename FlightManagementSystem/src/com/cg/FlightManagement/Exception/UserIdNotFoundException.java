package com.cg.FlightManagement.Exception;

public class UserIdNotFoundException extends Exception{
	private long userId;
	public UserIdNotFoundException() {
		super();
	}
	public UserIdNotFoundException(long userId) {
		super();
		this.userId = userId;
	}
	@Override
	public String toString() {
		return userId + "This User Id does not exist";
	}
	@Override
	public String getMessage() {
		return userId + "This User Id does not exist";
	}
	
}

