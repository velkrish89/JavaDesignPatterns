package StructuralDesignPatterns.Facade;

import java.time.LocalDate;

public class BookVacationMain {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(2023, 5, 12);
		LocalDate endDate = LocalDate.of(2023, 5, 22);

		//Without Facade
//		Flight flight = new Flight();
//		flight.bookOutwardJourney(startDate);
//		flight.bookReturnJourney(endDate);
//		
//		Hotel hotel = new Hotel();
//		hotel.bookHotel(startDate, endDate);
//		
//		CarRental carRental = new CarRental();
//		carRental.bookCar(startDate, endDate);
		
		//With Facade
		VacationFacade vacationFacade = new VacationFacade();
		vacationFacade.bookVacation(startDate, endDate);

	}

}
