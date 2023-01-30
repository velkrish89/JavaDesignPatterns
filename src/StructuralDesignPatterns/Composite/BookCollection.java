package StructuralDesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * When want to be able to treat single and multiple objects in the same way - Then we use composite design pattern
 * Here we are implemention same interface on NonFiction and Fiction book classes and BookCollection collection of objects
 *
 */

public class BookCollection implements Books{
	
	private List<Books> books = new ArrayList<>();
	
	public void addBook (Books book) {
		books.add(book);
	}

	@Override
	public void checkout() {
		books.forEach(Books::checkout);
		
	}

	@Override
	public void returnBook() {
		books.forEach(Books::returnBook);
		
	}

}
