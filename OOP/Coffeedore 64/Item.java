
public class Item{
   private String name;
   private double price;
   private int index;

    public String getNAME() {
        return name;
    }
    public void setNAME(String name) {
        this.name = name;
    }

    public double getPRICE() {
        return price;
    }
    public void setindex(int index) {
        this.index = index;
    }

    public int getindex(){
         return this.index;
    }
    public Item(String name ,double price) {
        this.name =name;
        this.price = price;
        
    }

    }
