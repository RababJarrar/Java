        
public class Test{
    public static void main(String[] args){

        PuzzleJava mypuzzle = new PuzzleJava();
        System.out.println(mypuzzle.getTenRolls());
//         for(int i=0; i<myPuzzle.getTenRolls().length; i++){
//         System.out.print(myPuzzle.getTenRolls()[i]+" "); 
//         }
        System.out.println(mypuzzle.getRandomLetter());
        System.out.println(mypuzzle.generatePassword());
        System.out.println(mypuzzle.getNewPasswordSet(5));
    }
}