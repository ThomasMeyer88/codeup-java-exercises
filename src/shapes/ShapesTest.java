package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(5,8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(4,4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}