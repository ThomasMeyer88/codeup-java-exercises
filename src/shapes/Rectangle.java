package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width){
        super(length, width);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return length * 2 + width * 2;
    }

}
