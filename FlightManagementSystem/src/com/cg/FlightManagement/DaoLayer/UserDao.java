package com.cg.FlightManagement.DaoLayer;

import com.cg.FlightManagement.Exception.UserIdNotDeletedException;
import com.cg.FlightManagement.Exception.UserIdNotFoundException;
import com.cg.FlightManagement.Exception.UserNotAddedException;
import com.cg.FlightManagement.Exception.UserNotFoundException;
import com.cg.FlightManagement.Exception.UserNotUpdatedException;

public interface UserDao {
	public void addUser(int User) throws UserNotAddedException;
	public void viewUserById(long userId) throws UserIdNotFoundException;
	public void viewUser() throws UserNotFoundException;
	public void updateUser(int User) throws UserNotUpdatedException;
	public void deleteUser(long userId) throws UserIdNotDeletedException;
}
