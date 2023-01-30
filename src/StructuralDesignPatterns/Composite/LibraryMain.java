package StructuralDesignPatterns.Composite;

public class LibraryMain {
	private static String libraryName = "Anna Library";

	public static void main(String[] args) {
		FictionBook fictionBookOne = new FictionBook("Ponniyin Selvan", true);
		FictionBook fictionBookTwo = new FictionBook("Velpari", false);
		NonFictionBook nonFictionBook = new NonFictionBook("A Brief History of Time");
		
		BookCollection bookCollection = new BookCollection();
		bookCollection.addBook(nonFictionBook);
		bookCollection.addBook(fictionBookOne);
		bookCollection.addBook(fictionBookTwo);
		
		checkoutBook(nonFictionBook);
		checkoutBook(fictionBookTwo);
		checkoutBook(bookCollection);
		System.out.println("-------------------------");
		
		returnBook(nonFictionBook);
		returnBook(fictionBookTwo);
		returnBook(bookCollection);
		

	}
	
	public static void checkoutBook(Books books) {
		System.out.println("Checking out from library " + libraryName);
		books.checkout();
	}
	
	public static void returnBook(Books books) {
		System.out.println("Return books from library " + libraryName);
		books.returnBook();
	}

}
