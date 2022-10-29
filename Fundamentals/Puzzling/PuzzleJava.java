import java.util.ArrayList;
import java.util.Random;


public class PuzzleJava{
    public int[] getTenRolls(){
        int [] myarray = new int [10];
        Random myrandom = new Random();
        for ( int i=0 ;i<10 ; i++){
            myarray[i]= myrandom.nextInt(20);

        }
        return myarray;

    }
    public char[] getRandomLetter(){
        char [] myarray2 = new char [26];
        Random rand = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz"; 
        for ( int i=0 ;i<26 ; i++){
            char randomChar = alphabetString.charAt(rand.nextInt(26));
            myarray2[i]= randomChar;
        }
        return myarray2;
    }
    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    public ArrayList<String>getNewPasswordSet(int len) {
        ArrayList<String> pass = new ArrayList<String>();
        for(int i = 0; i < len; i++) {
            pass.add(generatePassword());
        }
        return pass;
    }

}


