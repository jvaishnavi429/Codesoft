import java.io.*;
import java.util.*;
public class numberGuess{
    public static void main(String args[])
    { 
        Random rand = new Random();
        Scanner S = new Scanner(System.in);
        int randomNumber = rand.nextInt(100)+1;
        //System.out.println("Random number is " +randomNumber);
       while(true){
        System.out.println("Enter your Guess");
        int userGuess = S.nextInt();
        if(userGuess == randomNumber)
        {
            System.out.println("CORRECT...!!");
           break;
        }
        else if(randomNumber > userGuess)
        {
            System.out.println("NOT CORRECT....!!  Higher number...!! Guess Again....!!");
        }
        else
        {
            System.out.println("Nope...!!");
        }
    }

    }
}