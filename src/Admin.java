package store;

import java.util.Scanner;

public class Admin extends User {
	
	public Admin() {
		
	} 
	
    public Admin(String username, String password) {
        super(username, password);
    }
    
    //Log in admin
    @Override
    public void login() {
    	Scanner input = new Scanner(System.in);
    	
    	//Username
    	System.out.println("Enter the username");
    	String username = input.next();
    	setUsername(username);
    	
    	//Password
    	System.out.println("Enter the password");
    	String password = input.next();
    	setPassword(password);
    }
    
    //Log out admin
    @Override
    public void logout() {
    	System.out.println("\nThe admin has been logged out.");
    }
}
