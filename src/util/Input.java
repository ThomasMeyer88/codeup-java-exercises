package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");


    public static boolean yesNo(){

        System.out.println("Enter yes/no");
        String check = scanner.next();
        if(check.equals("y") || check.equals("Y") || check.equals("yes") || check.equals("Yes")){
            return true;
        } else {
            return false;
        }
    }
    public static int getInt(int min, int max){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between " + min + " and " + max);
        int input = sc.nextInt();
        if(input > max || input < min){
            getInt(min, max);
        } else {
            System.out.println("Thanks");
            return input;
        }
        return input;
    }
    public static double getDouble(double min, double max){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between " + min + " and " + max);
        double input = sc.nextDouble();
        if(input > max || input < min){
            getDouble(min, max);
        } else {
            System.out.println("Thanks");
            return input;
        }
        return input;
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a string: ");
        String input = sc.next();
        return input;
    }

    public static double getDouble(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a double: ");
        double input = sc.nextDouble();
        return input;
    }
    public static int getInt(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter an integer: ");
        int input = sc.nextInt();
        return input;
    }
}
