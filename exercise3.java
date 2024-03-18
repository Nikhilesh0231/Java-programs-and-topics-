package OOPs;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0 ;

    public int getNoOgGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOgGuesses) {
        this.noOfGuesses = noOgGuesses;
    }

    Game(){
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }
   void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
         if(  inputNumber==number)
          {
              System.out.format("Yes You Guessed It Right,It Was %d\nYou Guessed In %d Attempts",number,noOfGuesses);
             return true;
          }
      else if (  inputNumber<number)
          {
             System.out.println("Too Less...");
          }
      else if (  inputNumber>number)
          {
            System.out.println("Too High...");
          }
           return false;
    }
}
public class exercise3 {
    public static void main(String[] args) {
        /* Question.Create a class game ,which allows a user to play"geess the number"gsme once
        game should have the following method
        1.Constuctor to generate the random number
        2.takeuserinput() to take a user input of a number
        3.is correctnumber() todetect whethter the number entered by user is true
        4.getters and setters for no of guess
        use properties such as noOfguess(int),etc to get this code done
         */
        Game g=new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }
    }
}
