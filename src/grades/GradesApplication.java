package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Student jason = new Student("Jason");
        jason.addGrade(95); jason.addGrade(90); jason.addGrade(70); jason.addGrade(60);
        students.put("jayRoxs", jason);

        Student sonya = new Student("Sonya");
        sonya.addGrade(85); sonya.addGrade(79); sonya.addGrade(89); sonya.addGrade(94);
        students.put("synCity", sonya);

        Student dante = new Student("Dante");
        dante.addGrade(77); dante.addGrade(95); dante.addGrade(86); dante.addGrade(73);
        students.put("myInferno", dante);

        Student rochelle = new Student("Rochelle");
        rochelle.addGrade(99); rochelle.addGrade(103); rochelle.addGrade(101); rochelle.addGrade(93);
        students.put("deLyonesse", rochelle);

        System.out.println("Welcome!");
        System.out.println("Here are the gitHub usernames of our students: ");
        System.out.println("_______________________________________________");
        for ( String key : students.keySet() ) {
            System.out.print("|" +  key + "|  " );
        }
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Which student would you like to see more information on?");

        String choice = Input.getString();

        showInfo(students, choice);

    }

    public static void showInfo(HashMap students, String userName){
        if(students.containsKey(userName)){
            Student display = (Student)students.get(userName);
            System.out.println("Name is " + display.getName());
            System.out.println("Grades are " + display.getGrades());
            System.out.println("Average grade is " + display.getGradeAverage());

        } else {
            System.out.println(userName + " does not exist!!!");
        }
        System.out.println(" ");
        System.out.println("______________________________________________");
        System.out.println("Would you like to see another student?");
        String viewMore = Input.getString();
        if(viewMore.equals("yes") || viewMore.equals("Yes")){
            System.out.println("Please enter the student name: ");
            String studentName = Input.getString();
                    showInfo(students, studentName);
        }
    }
}
