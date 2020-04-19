package com.cg.FlightManagement.Servicelayer;

public interface UserService {
	public void addUser(int User) throws UserNotAddedException;
	public void viewUserById(long userId) throws UserIdNotFoundException;
	public void viewUser() throws UserNotFoundException;
	public void updateUser(int User) throws UserNotUpdatedException;
	public void deleteUser(long userId) throws UserIdNotDeletedException;
}
