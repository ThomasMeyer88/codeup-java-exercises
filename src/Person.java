import java.util.Scanner;

public class Person {

    private String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Person person1 = new Person("default");
        System.out.println(person1.getName());
        System.out.println("Please enter a new name: ");
        String newName = sc.next();
        person1.setName(newName);
        person1.sayHello();



    }


    public Person(String name){
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello " + name );

    }
}
