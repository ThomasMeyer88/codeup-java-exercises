package shapes;

public class Rectangle {
    protected double length;
    protected double width;



    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return (length*2) + (width*2);
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //    public static void main(String[] args){
//        Rectangle box = new Rectangle(3, 3);
//    }
}
