package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Number: ");
		int number = sc.nextInt();

		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());

		System.out.print("Check-Out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date. ");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkOut);
			System.out.println("Reservation: " + reservation + "\n\n");

			System.out.println("Enter data to update the reservation: ");

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());

			System.out.print("Check-Out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();
			if (checkin.before(now) || checkOut.before(now)) {
				System.out.println("Erron in reservation: Reservation dates for update must be future");
			} else if (!checkOut.after(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date. ");
			} else {

				reservation.update(checkin, checkOut);
				System.out.println(reservation);
			}
		}

	}
}
