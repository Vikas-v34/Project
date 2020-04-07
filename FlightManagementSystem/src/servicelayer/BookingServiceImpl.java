package servicelayer;

public class BookingServiceImpl {
	public void addBooking(String Booking){
		//:Booking :- Creates a new booking.
		}
	public void modifyBooking(String Booking) {
		/*: Booking :- Modifies a previous booking. All	information 
		related to the booking except the booking id can be
	modified.*/
	}
	public void viewBooking(long bookingId) {
		//: List<Booking> :- Retrieves a booking made by the user based on the booking id.
		}
	public void viewBooking() {
		//: List<Booking> :- Retrieves a list of all the bookings made.
		}
	public void deleteBooking(long bookingId) {
		//: void :-Deletes a previous booking identifiable by the ‘bookingId’.
		}
	public void validateBooking(String Booking) {
		//: void :-Validates the attributes of a booking.
	}
	public void validatePassenger(String Passenger)	{
		//: void :-	Validates the attributes of a passenger.
		}
}
