package StructuralDesignPatterns.Facade;

import java.time.LocalDate;

/**
 * 
 * When application has lot of complex function, to hide complexity behind the interface/class and show only the 
 * required function - we can use Facade design pattern
 * Benifits
 * 	Easier to use complex code
 * 	Promotes loose coupling
 * 	It is optional and not enforced
 *
 */

public class VacationFacade {
	
	public void bookVacation(LocalDate startDate, LocalDate endDate) {
		Flight flight = new Flight();
		flight.bookOutwardJourney(startDate);
		flight.bookReturnJourney(endDate);
		
		Hotel hotel = new Hotel();
		hotel.bookHotel(startDate, endDate);
		
		CarRental carRental = new CarRental();
		carRental.bookCar(startDate, endDate);
	}

}
