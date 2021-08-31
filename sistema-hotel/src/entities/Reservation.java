package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkin.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	
	public String update(Date checkin, Date checkout) {
		

		Date now = new Date();
		if (checkin.before(now) || checkOut.before(now)) {
		return "Erron in reservation: Reservation dates for update must be future";
		}
		if (!checkOut.after(checkin)) {
			return "Error in reservation: Check-out date must be after check-in date. ";
		}
		
		this.checkin = checkin;
		this.checkOut = checkout;
		
		return null;
	}
	
	
	@Override
	public String toString() {
		return "Room Number: "
				+ roomNumber
				+ ", checkin :"
				+ sdf.format(checkin)
				+ ", check-out: "
				+sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights"
				;
	}
	
}














