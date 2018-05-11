package grades;

import util.Input;

public class Main {
    public static void main(String[] args){
        Student jason = new Student("Jason");
        Student susan = new Student("Susan");
        susan.addGrade(90);
        susan.addGrade(85);
        susan.addGrade(75);
        jason.addGrade(100);
        jason.addGrade(60);
        jason.addGrade(55);

        System.out.println(susan.getName() + " grades and average");
        System.out.println(susan.getGrades());
        System.out.println(susan.getGradeAverage());
        System.out.println(jason.getName() + " grades and average");
        System.out.println(jason.getGrades());
        System.out.println(jason.getGradeAverage());


    }
}
