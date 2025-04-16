package store;

import java.util.ArrayList;

public class Order {
    private Customer customer; 
    private ArrayList<Book> purchasedBooks; //Purchases are stored in them
    
    public Order(Customer customer) {
    	purchasedBooks = new ArrayList<Book>();
        this.customer = customer;
    }
    
    //Add book to order
    public void addBookToOrder(Book book) {
        purchasedBooks.add(book);
        System.out.println("The book has been added to the order.");
    }

    //Get total price
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Book book : purchasedBooks) {
            totalPrice += book.getPrice();
        }
        return totalPrice;

    }

    //Display display purchased books
    public void displayPurchasedBooks() {
    	System.out.println("All books");
        for (Book book : purchasedBooks) {
        	System.out.println(book);
        }
    }

    //Display order bill
    public void orderBill() {
        System.out.println("\n\nOrder for " + customer.getUsername() + " is complete.");
        System.out.println("Books purchased:");
        for (Book book : purchasedBooks) {
            System.out.printf("- %s by %s $%.2f \n", book.getTitle(),  book.getAuthor(), book.getPrice());
        }
        System.out.printf("Total: $ %.2f \n", getTotalPrice());
    }
}