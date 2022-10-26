import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
	
        Item item1 = new Item("mocha",5);
        Item item2 = new Item("latte",10);
        Item item3 = new Item("drip coffee",6);
        Item item4 = new Item("capuccino",8);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("rabab");
        Order order4 = new Order("maryam");
        Order order5 = new Order("hadeel");
        
        order1.addItems(item1);
        order1.addItems(item2);
        order2.addItems(item2);
        order2.addItems(item3);
        order3.addItems(item4);
        order3.addItems(item3);
        order4.addItems(item1);
        order4.addItems(item3);
        order5.addItems(item2);
        order5.addItems(item4);

        order5.display();
    }
}
