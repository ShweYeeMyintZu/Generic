import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        Box<Integer, List<String>> box=new Box<Integer,List<String>>();
        List<String>message=new ArrayList<>();
        message.add("Hello");
        message.add("Hi");
        message.add("Hey");
        box.add(Integer.valueOf(10),message);
        System.out.println("Integer Value:: "+box.fistget());
        System.out.println("In ArrayList ::"+box.secondget());
    }
}
