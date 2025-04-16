package store;

import java.util.Scanner;

public class Customer extends User {
    private String email;
 

    public Customer() {
    	
    } 
    
    public Customer(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    //Log in customer 
    @Override
    public void login() {
    	Scanner input = new Scanner(System.in);
    	
    	//Email
    	System.out.println("Enter the email");
    	String email = input.next();
    	this.email = email;
    	
    	//Username
    	System.out.println("Enter the username");
    	String username = input.next();
    	setUsername(username);
    	
    	//Password
    	System.out.println("Enter the password");
    	String password = input.next();
    	setPassword(password);
    }
    
    //Log out customer
    @Override
    public void logout() {
    	System.out.println("\nThe customer has been logged out.");
    }
}
