package com.cg.FlightManagement.DaoLayer;

public interface UserDao {
	public void addUser(int User) throws UserNotAddedException;
	public void viewUserById(long userId) throws UserIdNotFoundException;
	public void viewUser() throws UserNotFoundException;
	public void updateUser(int User) throws UserNotUpdatedException;
	public void deleteUser(long userId) throws UserIdNotDeletedExcception;
}
