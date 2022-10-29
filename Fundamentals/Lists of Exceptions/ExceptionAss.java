import java.util.ArrayList;
public class ExceptionAss {

    public static void main(String[] args) {

    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");


        // try{
        //     for(int i = 0; i < myList.size(); i++) {
        //     Integer castedValue = (Integer) myList.get(i);
        //     System.out.println(castedValue);
        //     }
        // }
        // catch (java.lang.Exception Rabab){
        //     System.out.println(Rabab);
        // }
        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } 
            catch(ClassCastException e ) {
                // System.out.println(e);
                System.out.println("exceptions at index "+i+": "+myList.get(i));
            }


        }
    }
}

