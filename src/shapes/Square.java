package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side){
        this.length = side;
        this.width = side;
        this.side = side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return side*side;
    }
}
