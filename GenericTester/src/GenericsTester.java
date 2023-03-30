import javax.swing.*;

public class GenericsTester {
    public static void main(String[] args) {
    Box<Integer> integerBox=new Box<Integer>();
    Box<String> stringBox=new Box<String>();

    integerBox.add(new Integer(10));
    stringBox.add(new String("Hello Generic"));

        System.out.println("Integer Value :: "+integerBox.get());
        System.out.println("String Value :: "+stringBox.get());
    }

}
