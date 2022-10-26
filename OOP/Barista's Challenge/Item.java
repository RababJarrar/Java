import java.util.ArrayList;
public class Item{
   private String name;
   private double price;

    public String getNAME() {
        return name;
    }
    public void setNAME(String name) {
        this.name = name;
    }

    public double getPRICE() {
        return price;
    }
    public void setPRICE(double price) {
        this.price = price;
    }

    public Item(String name,double price){         //constructor
        this.name = name;
        this.price= price;
    }

    }
