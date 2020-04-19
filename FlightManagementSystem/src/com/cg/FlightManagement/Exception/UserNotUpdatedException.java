package com.cg.FlightManagement.Exception;

public class UserNotUpdatedException extends Exception{
	private int user;
	public UserNotUpdatedException() {
		super();
	}
	public UserNotUpdatedException(int user) {
		super();
		this.user = user;
	}
	@Override
	public String toString() {
		return user + "This User Name does not exist";
	}
	@Override
	public String getMessage() {
		return user + "This User Name does not exist";
	}
	
}


