//Multiple Type Parameter
public class GenericTest {
    public static void main(String[] args) {
        Box<Integer,String>box=new Box<Integer,String>();
        box.add(Integer.valueOf(10),"Hello Generic");
        System.out.print(box.firstget()+" ");
        System.out.println(box.secondget());


        Box<String,Double>box1=new Box<String,Double>();
        box1.add("Double You add will be :: ",5.0);
        System.out.print(box1.firstget());
        System.out.println(box1.secondget());
    }
}
