package store;

public class Menu {	
	
	//Display main menu
	public static void mainMenu() {	
        System.out.println("----------Menu----------");
        System.out.println("1- Admin login");
        System.out.println("2- Customer login");
        System.out.println("3- Close program");
        System.out.print("Enter your choice [1-3]: ");
	}
	
	//Display admin menu
	public static void adminMenu() {
        System.out.println("----------Admin----------");
        System.out.println("1- Add books to inventory");
        System.out.println("2- Remove books from inventory");
        System.out.println("3- Display all books in inventory");
        System.out.println("4- Logout");
        System.out.print("Enter your choice [1-4]: ");
	}
	
	//Display customer menu
	public static void customerMenu() {
		System.out.println("----------Customer----------");
        System.out.println("1- Add book to order");
        System.out.println("2- Display bill order");
        System.out.println("3- Logout");
        System.out.print("Enter your choice [1-3]: ");
	}
}

