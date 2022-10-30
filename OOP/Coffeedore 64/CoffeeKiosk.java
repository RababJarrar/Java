import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor - no params, initializes items and orders to empty arrays.
    public CoffeeKiosk (){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    
    //addMenuItem method should create a new item object with the given name and price.
    public void addMenuItem(String name , double price){
        Item item = new Item(name ,price);
        this.menu.add(item);
        item.setindex(menu.size()-1);
    }
    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i+" "+menu.get(i).getNAME()+"--$"+menu.get(i).getPRICE());
        }
        
    }
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            Item item = menu.get(Integer.parseInt (itemNumber));
            order.addItems(item);
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details
        order.display(); 
    	// as the example below. You may use the order's display method.
        
    }


}
