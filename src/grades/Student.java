package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }


    public double getGradeAverage(){
        int length = grades.size();
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += grades.get(i);
        }
        return sum/length;
    }
}
