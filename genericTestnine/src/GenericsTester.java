import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTester {
    public static void main(String[]args){
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(20));
        List<String> stringList=new ArrayList<String>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        System.out.printf("Integer value %d\n",integerList.get(0));
        System.out.printf("String value %d\n",integerList.get(0));
        System.out.println("__________________________________________________________________");

        for(Integer data:integerList){
            System.out.println("Integer Value: "+data);
        }
        System.out.println("__________________________________________________________________");
        Iterator<String> stringIterator=stringList.iterator();
        while (stringIterator.hasNext()){
            System.out.println("String Value: "+stringIterator.next());
        }
        System.out.println("__________________________________________________________________");
        for(String data:stringList){
            System.out.println("String Value with foreach: "+data);
        }
        System.out.println("__________________________________________________________________");

    }
}
