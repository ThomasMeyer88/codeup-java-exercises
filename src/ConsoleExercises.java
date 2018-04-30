import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        String userInput;
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        int nextInt;

        System.out.println("Please enter an integer: ");
        nextInt = sc.nextInt();
        System.out.println("You entered: " + nextInt);

        String firstWord;
        String secondWord;
        String thirdWord;
        String wordSentence;
        System.out.println("Please enter three words: ");
        wordSentence = sc.next();
        String[] wordArray = wordSentence.split(" ");
        firstWord = wordArray[0];
        secondWord = wordArray[1];
        thirdWord = wordArray[2];
        System.out.println("You entered the following: ");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);


        String newSentence;
        System.out.println("Please enter a sentence: ");
        newSentence = sc.next();
        System.out.println("This is your sentence: " + newSentence);

        int length;
        int width;
        String lengthWidth;

        System.out.println("Please enter a length and width: ");
        lengthWidth = sc.next();
        char letterOne = lengthWidth.charAt(0);
        char letterTwo = lengthWidth.charAt(1);
        length = Character.getNumericValue(letterOne);
        width = Character.getNumericValue(letterTwo);
        System.out.println(length + " " + width);
        int area = length*width;
        int perimeter = (2*length)+(2*width);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);

    }

}
