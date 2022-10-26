import java.util.ArrayList;
public class Order{
    private String name;
    private  double total;
    private  boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();
    
    public String getNameOfOrder() {
        return name;
    }
    public void setNameOfOrder(String name) {
        this.name = name;
    }
    public boolean getREADY() {
        return ready;
    }
    public void setREADY(boolean ready){
        this.ready= ready;
    }

    public ArrayList getArrayOfItems(){
        return items;
    }

    public void setArrayOfItems(ArrayList<Item> items){
        this.items = items;
    }

    public Order(){        //constructor
        name= "Guest";
        ArrayList<Item> items = new ArrayList<Item>();
    }
    public Order(String name){         //constructor overloading
        this.name = name;
    }
    public void addItems(Item item){                  // addItems(nameOfClass AnyVariable)
        items.add(item);
    }
    public String getStatusMessage(){
        String message;
        if (this.ready==true){
             message="Your order is ready.";
        }
        else{
             message="Thank you for waiting. Your order will be ready soon.";
        }
        return message;
        }

    public void display(){
        System.out.printf("customer name : "+this.name+"\n");
        for(int i=0; i<this.items.size();i++){
            System.out.println(this.items.get(i).getNAME()+ " : " +this.items.get(i).getPRICE());
        }
             System.out.println("Total : "+getOrderTotal());

    }
    public double getOrderTotal(){
        double total=0;
        for(int i=0; i<this.items.size();i++){
            total=total + this.items.get(i).getPRICE();
            
        }
        return total;
    }
}