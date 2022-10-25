import java.util.ArrayList;

class CafeUtil{
    public int getStreakGoal(){
        int sum=0;
        for (int i=0;i<11;i++){
            sum = sum+i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        int sum=0;
        for (int i=0;i<5;i++){
            sum = sum+i;
        }
        return sum; 
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
    }





}