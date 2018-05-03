package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.yesNo());
        Input.getInt(1,10);
        Input.getDouble(5.3,11.9);
        System.out.println(Input.getString());
        System.out.println(Input.getDouble());
        System.out.println(Input.getInt());
    }
}
