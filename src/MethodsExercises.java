import java.util.Scanner;

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
}
