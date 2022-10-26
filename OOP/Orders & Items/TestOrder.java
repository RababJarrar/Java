import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
	

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 8;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price =5;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 6;
    


        Order order1 = new Order();
        order1.name = "Cindhuri";   
        order1.ready = true;
        order1.items.add(item3);
        order1.total += item3.price;
       
        Order order2 = new Order();
        order2.name = "Jimmy"; 
        order2.ready = true;
        order2.items.add(item1);
        order2.total += item1.price;

        Order order3 = new Order();
        order3.name = "Noah";    
        order3.ready = false;
        order3.items.add(item4);
        order3.total += item4.price;

        Order order4 = new Order();
        order4.name = "Sam"; 
        order4.ready = false;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price;
        order4.total += 2*item2.price;
//////////////
        

    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Total2: %s\n", order2.total);
        System.out.printf("Total3: %s\n", order3.total);
        System.out.printf("Total4: %s\n", order4.total);
    }
}
