import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Snack> menu;
    private ArrayList<Order> orders;

    // Constructor, initializes snacks and orders to empty arrays.
    public VendingMachine (){
        this.menu = new ArrayList<Snack>();
        this.orders = new ArrayList<Order>();
    }
    
    // AddSnacks method should create a new snack object with name, price and quantity.
    public void AddSnacks(String name , double price, int quantity){
        Snack snack = new Snack(name ,price,quantity);
        this.menu.add(snack);
        snack.setindex(menu.size()-1);
    }

    // displayMenu method should display a menu of snacks with its price and quantity.
    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i+"- "+menu.get(i).getNAME()+"  Price: "+menu.get(i).getPrice()+"$  Qantity: "+menu.get(i).getQuantity());
        }    
    }

    // newOrder method should make a new order for customer.
    public void newOrder() {      
        ArrayList<Double> coins = new ArrayList<Double>();
		ArrayList<Double> notes = new ArrayList<Double>();
        String Continue = "N";
        double totalEnteredMoney=0;
        while(true) {
            if(!Continue.equals("Y"))
            // Greeting message , and start making an order
            System.out.println("Hello, Are you want to make order? Press any key to start ,,,");
            String name = System.console().readLine();
            Order order = new Order(name);
            // Show the snacks menu.
            displayMenu();
            // Allow the user to enter an snack number.
            System.out.println("Please enter a number of snack you want to purchase or you can press 'X' to end your order:");
            String snackNumber = System.console().readLine();            
            // Write a while loop to collect all user's order snacks
            while(!snackNumber.equals("X")) {
                // check if customer try to enter a valid number for snack or not.
                if ( Integer.parseInt(snackNumber)  > -1 && Integer.parseInt(snackNumber) < 25){
                    // Get the snack object from the menu, and add the snack to the order
                    Snack snack = menu.get(Integer.parseInt (snackNumber));
                    // Check if snack is available (show message for customer) and added to customer order if its available.
                    if (snack.getQuantity()>0){
                        System.out.println("You choose '"+snack.getNAME()+"', and its price "+snack.getPrice()+"$ ,its successfully added to your order");  
                        order.AddSnack(snack);
                        snack.DecreaseQuantity();
                    }
                    else{
                        System.out.println("You choose '"+snack.getNAME()+"'. Sorry, Its not available now");  
                    }
                }  
                else{
                    System.out.println("Please enter a valid number");
                }  
                // Ask them to enter a number for a new snack or enter X to end order.
                System.out.println("Are you want to purchase more? Enter a number of snack or you can press 'X' to end your order:");
                snackNumber = System.console().readLine();                
            }
            // Display order detailes, and Ask customer to confirm order.
            order.display();
            System.out.println("Press 'Y' to Confirm your order ,,");
            Continue = System.console().readLine();
            //Ask customer to enter money , and display a message to show them his total order.
            while(Continue.equals("Y")) {
                System.out.println("Please enter money , "+"You order :  "+ order.getOrderTotal()+" $"); 
                // Ask customer if he want to enter notes.
                System.out.println("Do you want to enter notes? Press 'Y' for Yes and 'N' for No");
                String Notes = System.console().readLine();
                if(Notes.equals("Y")) {
                    System.out.println("Please enter the notes, (Only '20$' & '50$' is accepted) ..");
                    String MoneyNotes = System.console().readLine();
                    // check if entered notes acceptable or not .
                    if (Integer.parseInt(MoneyNotes) == 20 || Integer.parseInt(MoneyNotes)==50) {
                        notes.add(Double.parseDouble(MoneyNotes));
                    }
                    else{
                        System.out.println("Notes are rejected, (Only '20$' & '50$' is accepted)");
                    }                    
                }
                //Ask customer if he want to enter coins.
                System.out.println("Do you want to enter coins? Press 'Y' for Yes and 'N' for No");
                String Coins = System.console().readLine();
                if(Coins.equals("Y")) {
                    System.out.println("Now enter the coins, (Only  '10c', '20c', '50c', '100c' is accepted) ..");
                    String moneyCoins = System.console().readLine();
                    // check if entered coins acceptable or not .
                    if( Integer.parseInt(moneyCoins) == 10 || Integer.parseInt(moneyCoins)== 20 || Integer.parseInt(moneyCoins)==50 || Integer.parseInt(moneyCoins)==100){
                        coins.add(Double.parseDouble(moneyCoins));
                    }
                    else{
                        System.out.println("Coins are rejected,(Only  '10c', '20c', '50c', '100c' is accepted)");
                    }
                }
                //Display the total notes and coins that the customer entered.
                System.out.println(String.format("You entered %.2f notes and %.2f coins .", notes.stream().mapToDouble(a -> a).sum(), coins.stream().mapToDouble(a -> a).sum()));
                //Ask customer if he want to continue entering money or not .
                System.out.println("Do you want to continue entering money ?");
                Continue = System.console().readLine();
            }
            // calculate the total money which entered by customer.
            double totalNotes =notes.stream().mapToDouble(a -> a).sum();
            double totalCoins= coins.stream().mapToDouble(a -> a).sum();
            totalEnteredMoney= totalCoins/100+totalNotes;
            //check if total money which entered by customer equal to his order or not,, and display a message of its status.
            if (totalEnteredMoney== order.getOrderTotal()){
                System.out.println("Thank you for ordering, please take your order ,Goodbye");
                notes.clear();
                coins.clear();
            }
            else if (totalEnteredMoney > order.getOrderTotal()){
                double remainMoney= totalEnteredMoney-order.getOrderTotal();
                System.out.println("Thank you for ordering, You have "+ remainMoney +"$ remaining, please take them. ");
                notes.clear();
                coins.clear();
            }
            else if (totalEnteredMoney < order.getOrderTotal()){
                System.out.println("Sorry, Your money is not enough, please try again");
                notes.clear();
                coins.clear();
                Continue ="N";
            }
        }        
    }
}
