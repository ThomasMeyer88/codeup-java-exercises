package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Area is " + box1.getArea());
        System.out.println("Perimeter is " + box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("Square area is " + box2.getArea());
        System.out.println("Square perimeter is " + box2.getPerimeter());
    }
}
