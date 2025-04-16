//________________________________________________________________________________________________
//      
//  	Bookstore Management System
//
//		المشروع عبارة عن برانامج يطلب من المستخدم تسجيل الدخول سواء كان مسؤولاً أو عميلاً
//		إذا كان مسؤولا فيمكنه إدارة المكتبة، وإذا كان عميلاً فيمكنه الشراء منها 
//
//
//________________________________________________________________________________________________

package store; 

import java.util.Scanner; //Scanner reading from the user

//________________________________________________________________________________________________

public class BookStoreTest {
    public static void main(String[] args) {
    	
        System.out.println("========================");
        System.out.println("-------BOOK STORE-------");
        System.out.println("========================\n\n");

        Scanner input = new Scanner(System.in); //Create object from Scanner to read from user
 
        Inventory inventory = new Inventory(); //Create object for library inventory
        Admin admin = new Admin(); //Create object to add an admin 
        Customer customer = new Customer(); //Create object to add an customer  
        Order orders = new Order(customer); //Create object for customer purchases
        
        Book[] books = {
                new Book("النهضة_العربية_والإسلامية", "الطرابلسي", 299.00),
                new Book("الحضارة_العربية_الإسلامية", "الرافعي", 399.99),
                new Book("تاريخ_الأمة_العربية", "الصلاحي", 199.99),
                new Book("تاريخ العرب", "عمر رضا", 79.00),
                new Book("العرب_والعالم_الحديث", "محمد عمارة", 159.00),
                new Book("الصحراء_والبحر", "جون كليبر", 499.99),
                new Book("العصور_الوسطى_في_الأندلس", "محمد شهاب", 329.00)
        }; //Create object for books 
        
//_________________________________________________________________________________________________
        
        //while loop for (main menu)
        boolean run1 = true; 
        while (run1) 
        { 
        	Menu.mainMenu(); //Call method for display (main menu)
        	
        	//The user was asked to choose a number from (main menu)
            int choiceMain = input.nextInt();
            switch (choiceMain) 
            {
            
//________________________________________________________________________________________________ 
            
            //Admin
                case 1:   
                	admin.login(); //Log in admin
                	
                	//while loop for (main admin)
                    boolean run2 = true; 
                    while(run2)
                    {
                    Menu.adminMenu(); //Call method for display (admin menu)
                    
                    //The user was asked to choose a number from the (admin menu)
                    int choiceAdmin = input.nextInt(); 
                    switch (choiceAdmin) 
                    {
                    
                    //Add books
                        case 1:
                        	if(inventory.getAllBooks().isEmpty()) {
                        		 System.out.println("\nAdding books to inventory...");
                        		 for (Book book : books) { 	
                        			 inventory.addBook(book);
                        		 }
                        	 } else {
                        		System.out.println("The inventory is full of books.");
                        	 }
                            break;
                            
                  //Remove books
                        case 2: 
                            if(inventory.getAllBooks().isEmpty()) {
                            	System.out.println("The inventory has no books.");
                            } else {
                            	System.out.println("\nRemoving books from inventory...");
                            	for (Book book : books) {
                            		inventory.removeBook(book);
                            	}
                            }
                            break; 

                 //Display all books in inventory
                        case 3: 
                            inventory.displayAllBooks();
                            break;
                            
                //Log out admin
                        case 4: 
                            admin.logout();
                            run2 = false;
                        	break;

                        default:
                            System.out.println("\nChoose an error and try again!!!\n");
                            break;
                            
                    } //End switch admin 
                    	continue;
                    	
                } //End while loop admin
                    continue;
                    
//________________________________________________________________________________________________
                    
          //Customer
                case 2:
                	customer.login(); //Log in to customer
                	
                	//while loop for (main customer)
                    boolean run3 = true; 
                    while(run3)
                    {
                	Menu.customerMenu(); //Call method for display (customer menu)

                	//The user was asked to choose a number from the (customer menu)
                    int choiceCustomer = input.nextInt(); 
                    switch (choiceCustomer)
                     {
                    
                    //Book purchase
                        case 1: 
                            System.out.println("\nSimulating purchases and orders...");
                            if(inventory.getAllBooks().isEmpty()) {
                            	System.out.println("The inventory has no books.");
                            } else {
                            	inventory.displayAllBooks();
                            	System.out.print("\nEnter title book:");
                            	String title = input.next();
                            	boolean bookFound = false;
                            	for (Book book : books) {
                            		if (title.equals(book.getTitle())) {
                            			orders.addBookToOrder(book);
                            			bookFound = true;
                            			break;
                            		}
                            	}
                            	if(bookFound == false) {
                            	//Exception handling 
                            	throw new IllegalArgumentException("Invalid book name.");
                            	}
                            }
                            break;

                   //Display order bill   
                        case 2: 
                            orders.orderBill();
                            break;

                  //Log out customer    
                        case 3: 
                        	customer.logout();
                            run3 = false;
                        	break;

                        default:
                            System.out.println("\nChoose an error and try again!!!\n");
                            break;
                            
                    } //End switch customer 
                    	continue;
                    	
                } //End while loop customer
                    continue;

//________________________________________________________________________________________________
                    
          //Close program
                case 3:
                    run1 = false;
                    break;

                default:
                    System.out.println("\nChoose an error and try again!!!\n");
                    break;
                    
            } //End switch main menu
        } //End while loop main menu
    } //End main method
} //End class BookStoreTest
