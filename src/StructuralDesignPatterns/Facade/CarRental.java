package StructuralDesignPatterns.Facade;

import java.time.LocalDate;

public class CarRental {
	
	public void bookCar(LocalDate startDate, LocalDate endDate) {
		System.out.println("Booking a car for " + startDate + " to " + endDate);
	}

}
