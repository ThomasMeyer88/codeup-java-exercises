//Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.


import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Let's talk to Bob!");
        System.out.println("Say something!");
        String input = sc.next();
        int length = input.length() - 1;
        if(input.charAt(length) == '!'){
            System.out.println("Bob says: Dude chill bro...");
        } else if(input.charAt(length) == '?'){
            System.out.println("Bob says: Sure bro...");
        } else if(input.trim().equals("")){
            System.out.println("Bob says: Fine! Be that way!");
        } else {
            System.out.println("Bob says: Whatevs bruh");
        }
    }
}
