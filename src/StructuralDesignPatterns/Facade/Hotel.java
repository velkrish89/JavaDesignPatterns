package StructuralDesignPatterns.Facade;

import java.time.LocalDate;

public class Hotel {
	
	public void bookHotel(LocalDate checkInDate , LocalDate checkOutDate) {
		System.out.println("Booking a hotel for " + checkInDate + " to " + checkOutDate);
	}

}
