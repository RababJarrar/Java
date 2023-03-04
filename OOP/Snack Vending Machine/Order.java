import java.util.ArrayList;
public class Order{
    private String name;
    private ArrayList <Snack> snacks = new ArrayList <Snack>();
    
    //constructor
    public Order(){        
        name= "Guest";
        ArrayList<Snack> snacks = new ArrayList<Snack>();
    }
    public Order(String name){         
        this.name = name;
    } 
    // method to add snacks to Snacks
    public void AddSnack(Snack snack){
        snacks.add(snack);
    }
    // method to display the snack (name, price and Quantity)
    public void display(){
        System.out.printf("Thank you ,these are snacks that you orderd with its price :"+"\n");
        for(int i=0; i<this.snacks.size();i++){
            System.out.println(this.snacks.get(i).getNAME()+ " :  " +this.snacks.get(i).getPrice()+" $");
        }
        System.out.println("You have to pay :  "+getOrderTotal()+" $");

    }
    // method to calculate the total order for the customer.
    public double getOrderTotal(){
        double total=0;
        for(int i=0; i<this.snacks.size();i++){
            total=total + this.snacks.get(i).getPrice();    
        }
        return total;
    }
}