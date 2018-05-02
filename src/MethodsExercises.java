import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter an integer: ");
        int x = sc.nextInt();
        System.out.println("Please enter another integer: ");
        int y = sc.nextInt();
        System.out.println("You entered " + x + " and " + y);
        System.out.println("Addition = " + addition(x, y));
        System.out.println("Subtraction = " + subtraction(x,y));
        System.out.println("Multiplication = " + multiplication(x,y));
        System.out.println("Division = " + division(x,y));
        System.out.println("Modulus = " + modulus(x,y));
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        getInteger(1, 10, input);

        System.out.println("For factorial please enter a number from 1-10: ");
        int factInt = sc.nextInt();
        factorial(factInt);

        System.out.println(" ");
        System.out.println("Please enter the number of sides on a pair of dice: ");
        int sides = sc.nextInt();
        diceRoll(sides);

    }
    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static long division(int x, int y){
        return x/y;
    }
    public static int modulus(int x, int y){
        return x%y;
    }
    public static int getInteger(int min, int max, int x){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        if(x >= min && x <= max){
            System.out.println("That number is valid! You entered: " + x);
            return x;
        }
        System.out.println("That number is not valid! Please enter an integer");
        int input = sc.nextInt();
        int userInput = getInteger(1, 10, input);
        return x;

    }
    public static long factorial(int x){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Do you wish to continue? Enter Yes/No: ");
        String confirm = sc.next();
        long factResult = 1;
        if(confirm.equals("Yes")){
            if(x >= 1 && x <= 10){
                System.out.print(x + "! = ");
                for(int i = 1; i <= x; i++){
                    factResult = i * factResult;
                    if(i > 1 && i < x){
                        System.out.print(" x " + i);
                    } else if(i == x){
                        System.out.print(" x " + i + " = " + factResult);
                        return factResult;
                    } else {
                        System.out.print(" " + i);

                    }
                }
            }
        }
        return x;
    }

    public static long diceRoll(int sides){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        long randOne = Math.round(Math.random() * sides) + 1;
        System.out.println("First dice rolls " + randOne);
        double randTwo = Math.round(Math.random() * sides) + 1;
        System.out.println("Second dice rolls" + randTwo);
        System.out.println("Would you like to roll again? Yes/No");
        String confirm = sc.next();
        if(confirm.equals("Yes") || confirm.equals("yes")){
            diceRoll(sides);
        }
        return sides;

    }
}
