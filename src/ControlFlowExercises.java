import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        for (long i = 1; i <= 100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0 && i % 3 != 0){
                System.out.println("Buzz");
            } else if(i % 5 != 0 && i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }


        }

        int power;
        System.out.println("Please enter an integer: ");
        power = sc.nextInt();
        System.out.println("Would you like to continue? Yes/No");
        String answer = sc.next();
        if(answer.equals("Yes")){
            System.out.println("Here is your table!");
            System.out.println("Number | Squared | Cubed");
            for(int x = 1; x <= power; x++ ){
                System.out.println("    " + x + "  |  " + (x*x) + "      |  " + (x*x*x));
            }
        }

        int grade;
        System.out.println("Please enter a numerical grade from 0-100: ");
        grade = sc.nextInt();
        System.out.println("Would you like to continue? Yes/No");
        String gradeAnswer = sc.next();
        if(gradeAnswer.equals("Yes")){
            if(grade >= 88){
                System.out.println("That's an A!");
            } else if(grade <= 87 && grade > 79){
                System.out.println("That's a B!");
            } else if(grade <= 79 && grade > 66){
                System.out.println("That's a C");
            } else if(grade <=66 && grade > 59 ){
                System.out.println("That's a D :|");
            } else {
                System.out.println("That's an F :(");
            }
        }
    }

}
