package com.cg.FlightManagement.Exception;

public class UserNotAddedException extends Exception{
	private int user;
	public UserNotAddedException() {
		super();
	}
	public UserNotAddedException(int user) {
		super();
		this.user = user;
	}
	@Override
	public String toString() {
		return user + "User is not added";
	}
	@Override
	public String getMessage() {
		return user + "User is not added";
	}
	
}



