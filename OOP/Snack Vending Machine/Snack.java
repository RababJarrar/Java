public class Snack{
    private String name;
    private double price;
    private int quantity;
    private int index;

    public Snack(String name ,double price, int quantity) {
        this.name =name;
        this.price = price;
        this.quantity=quantity;
    }
    public String getNAME() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getindex(){
        return this.index;
    }
    public void setindex(int index) {
        this.index = index;
    }
    public int DecreaseQuantity() {
        return quantity = quantity-1;
    }

    }
