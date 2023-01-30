package StructuralDesignPatterns.Composite;

public class NonFictionBook implements Books{
	
	  String title;
	  boolean isCheckedOut;

	  public NonFictionBook(String title) {
	    this.title = title;
	    isCheckedOut = false;
	  }


	@Override
	public void checkout() {

	    if(!isCheckedOut) {
	      System.out.println("Checking out " + title + "\n");
	      isCheckedOut = true;
	    } else {
	      System.out.println(title + " is already checked out\n");
	    }

	}

	@Override
	public void returnBook() {

	    if(isCheckedOut) {
	      System.out.println("Returning " + title + "\n");
	      isCheckedOut = false;
	    } else {
	      System.out.println(title + " is not checked out\n");
	    }
	  }

}
