package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Circle newCircle = new Circle(Input.getDouble());
        System.out.println("area = " + newCircle.getArea());
        System.out.println("circumference = " + newCircle.getCircumference());
    }
}
