package store;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book> books; //Books are stored in it
    private static int countBooks = 0; //Number of books

    public Inventory() {
        books = new ArrayList<Book>();
    }
    
    //Add book to inventory
    public void addBook(Book book) {
    	System.out.println("- Added: " + book.getTitle() + " to inventory.");
        books.add(book);
        countBooks++;
    	}
    
    //Remove book to inventory
    public void removeBook(Book book) {
    	System.out.println("- Removed: " + book.getTitle() + " to inventory.");
    	books.remove(book);
    	countBooks--;
    }

    //Get all books in inventory
    public ArrayList<Book> getAllBooks() {
    	return books;
    }
    
    //Display all books in inventory
    public void displayAllBooks() {
    	System.out.println("\n==========All books==========");
        for (Book book : books) {
        	System.out.println(book);
        	}
        System.out.printf("Total books in inventory: %d\n", countBooks);
    	}
}