/**
 * Class for show.
 */
class Show {
	String movieName;
	String dateTime;
	String[] seatNumber;
	Patron[] booked;
	Show(final String movieName, final String dateTime, final String[] seatNumber) {
		this.movieName = movieName;
		this.dateTime = dateTime;
		this. seatNumber = seatNumber;
		this.booked = new Patron[seatNumber.length];
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return movieName+","+dateTime;
	}
}