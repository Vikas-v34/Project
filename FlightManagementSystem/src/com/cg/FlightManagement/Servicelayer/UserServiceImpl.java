package com.cg.FlightManagement.Servicelayer;

import com.cg.FlightManagement.DaoLayer.UserDaoImpl;

public class UserServiceImpl implements UserService{
	private UserDaoImpl dao = new UserDaoImpl();
	public void addUser(int User){
		
	}
	public void viewUserById(long userId) {
	//:User :-
	//Shows the details of a user identifiable by the user id.
	}
	public void viewUser(){
	//: List<User> :-
	//Shows the details of all users.
	}
	
	public void updateUser(int User) {
	//:User :-
	//Updates the details of a user.
	}
	public void deleteUser(long userId) {
	//:void
	//Removes a user as per the user id.
	}
	public void validateUser(int User) {
	//: void :-
	//Validates the attributes of a user.
	}
}
