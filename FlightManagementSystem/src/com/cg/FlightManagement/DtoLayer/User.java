package com.cg.FlightManagement.DtoLayer;

import java.util.Arrays;

public class User {
	public String userType;
	public long userId;
	public String userName;
	public char[] userPassword;
	public long userPhone;
	public String userEmail;
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(char[] userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userType=" + userType + ", userId=" + userId + ", userName=" + userName + ", userPassword="
				+ Arrays.toString(userPassword) + ", userPhone=" + userPhone + ", userEmail=" + userEmail + "]";
	}
}
