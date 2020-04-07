package uiLayer;

import java.util.Scanner;

import dtoLayer.Flight;
import servicelayer.FlightServiceImpl;

public class FlightManagementApp {

	public static void main(String[] args) {
		int ch=1;
		boolean result;
		int seatCapacity;
		int flightNumber;
		String flightName,carrierName;
		
		System.out.println("Enter 1 for Admin");
		System.out.println("Enter 2 for User");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		FlightServiceImpl srvc = new FlightServiceImpl();
		if(choice == 1) {
			while(ch!=3) {
				System.out.println("Press 1 to add flight");
				System.out.println("Press 2 to Delete Flight");
				System.out.println("Press 3 to Logout");
				ch = sc.nextInt();
				switch(ch) {
				case 1:
						System.out.println("Enter Flight Number");
						flightNumber = sc.nextInt();
						System.out.println("Enter Flight Name");
						flightName = sc.next();
						System.out.println("Enter Carrier Name");
						carrierName = sc.next();
						System.out.println("Enter Seat Capacity");
						seatCapacity = sc.nextInt();
						Flight Flight = new Flight(flightName,carrierName,seatCapacity,flightNumber);
						result = srvc.addFlight(Flight);
						if(result==true) 
							System.out.println("Flight Added Successfully"); 
						else 
							System.out.println("UnSuccessfull Event");
						break;
				case 2:
					System.out.println("Enter Flight Number");
					flightNumber = sc.nextInt();
					result = srvc.deleteFlight(flightNumber);
					if(result == true)
						System.out.println("Flight Deleted Successfully");
					else
						System.out.println("Unsuccessfull event"); 
					break;
				case 3:
					System.out.println("Logged Out");
					break;
				default:
					System.out.println("Invalid Event");
				}
			}
		}sc.close();
	}

}
