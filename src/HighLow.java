import java.util.Scanner;
import java.util.Random;


public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        long random = Math.round(Math.random() * 100) + 1;
        System.out.println("Please guess a number between 1 - 100: ");
        int userGuess = sc.nextInt();
        int guessCount = 1;

        guessing(random, userGuess, guessCount);

    }
    public static long guessing(long target, int input, int counter){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        if(input == target){
            System.out.println("Good guess! You're correct!");
            System.out.println("It took you " + counter + " tries!");
        } else if(counter > 10) {
            System.out.println("Too many guesses! Game over!");
        }
        else if(input > target){
            System.out.println("Lower! Try again!");
            int newGuess = sc.nextInt();
            counter++;
            guessing(target, newGuess, counter);
        } else if(input < target){
            System.out.println("Higher! Try again!");
            int newGuess = sc.nextInt();
            counter++;
            guessing(target, newGuess, counter);
        }
        return input;
    }
}
