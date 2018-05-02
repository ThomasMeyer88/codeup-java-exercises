import java.util.Scanner;
import java.util.Random;


public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        long random = Math.round(Math.random() * 100) + 1;
        System.out.println("Please guess a number between 1 - 100: ");
        int userGuess = sc.nextInt();

        guessing(random, userGuess);

    }
    public static long guessing(long target, int input){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        if(input == target){
            System.out.println("Good guess! You're correct!");
        } else if(input > target){
            System.out.println("Lower! Try again!");
            int newGuess = sc.nextInt();
            guessing(target, newGuess);
        } else if(input < target){
            System.out.println("Higher! Try again!");
            int newGuess = sc.nextInt();
            guessing(target, newGuess);
        }
        return input;
    }
}
