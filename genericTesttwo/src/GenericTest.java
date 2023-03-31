//Type Inference
public class GenericTest {
    public static void main(String[] args) {


        //type inference
        Box<Integer> intvalue = new Box<>();
        //unchecked conversion warning
        Box<String> stringBox = new Box<String>();

        intvalue.add(new Integer(10));
        stringBox.add("Hello Generic");

        System.out.println("Integer Value :: " + intvalue.get());
        System.out.println("String value :: " + stringBox.get());
    }
}
