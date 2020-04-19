package com.cg.FlightManagement.DaoLayer;

public interface UserDao {
	public void addUser(int User);
	public void viewUserById(long userId);
	public void viewUser();
	public void updateUser(int User);
	public void deleteUser(long userId);
	public void validateUser(int User);
}
