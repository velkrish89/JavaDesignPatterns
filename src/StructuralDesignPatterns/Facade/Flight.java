package StructuralDesignPatterns.Facade;

import java.time.LocalDate;

public class Flight {
	
	public void bookOutwardJourney(LocalDate startDate) {
		System.out.println("Outbound flight booked for " + startDate);
	}
	
	public void bookReturnJourney(LocalDate endDate) {
		System.out.println("Return flight booked for " + endDate);
	}

}
