
public class Fan{
    int speed = 0;
    boolean on = false;
    double radius = 5.0;
    String color ="blue";
    public Fan(){
    }

    Fan(int speed,double radius,String color,boolean on){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.on=on;
    }
    public void display(){
        if(on){
            System.out.println("Fan is on\nThe speed is="+speed+"\nthe color is ="+color+"\nthe radius is ="+radius);
        } else {
            System.out.println("Fan is off!"+"\nthe color is ="+color+"\nthe radius is ="+radius);
        }
    }
 
}