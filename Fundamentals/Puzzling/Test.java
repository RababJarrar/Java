

public class Test {
    public static void main(String[] args) {
        PuzzleJava myPuzzle = new PuzzleJava();
        for(int i=0; i<myPuzzle.getTenRolls().length; i++){
            System.out.print(myPuzzle.getTenRolls()[i]+" ");
            
        }
        System.out.println("\n");
        for(int i=0; i<myPuzzle.getRandomLetter().length; i++){
            System.out.print((myPuzzle.getRandomLetter()[i])+" ");

        }
        System.out.println("\n");
        System.out.println(myPuzzle.generatePassword());

        System.out.println("\n");
        System.out.println(myPuzzle.getNewPasswordSet(2));
        
    }
}
