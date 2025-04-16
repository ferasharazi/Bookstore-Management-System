package store;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
    	
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    //Constructor by copy
    public Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
    }
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
    public String toString() {
        return String.format(" Title: %s\n Author: %s\n Price: %.2f\n", title, author, price);
    }
}
