package com.cg.FlightManagement.Exception;

public class UserIdNotDeletedException extends Exception {
	private long userId;
	public UserIdNotDeletedException() {
		super();
	}
	public UserIdNotDeletedException(long userId) {
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
