import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericTest {
    public static void main(String[]args){
        Map<Integer,Integer>integerMap=new HashMap<Integer,Integer>();
        integerMap.put(1,10);
        integerMap.put(2,20);
        Map<String,String>stringMap=new HashMap<String,String>();
        stringMap.put("a","Hello World");
        stringMap.put("b","Hello Generic");

        System.out.println("Integer value :: "+integerMap.get(1));
        System.out.println("Integer value :: "+integerMap.get(2));
        System.out.println("_______________________________________________");

        Iterator<Integer> integerIterator=integerMap.keySet().iterator();
        while(integerIterator.hasNext()){
            System.out.println("Integer key value :: "+integerIterator.next());
        }
        Iterator<String> stringIterator=stringMap.keySet().iterator();
        while(stringIterator.hasNext()){
            System.out.println("String key Value :: "+stringIterator.next());
        }
        System.out.println("---------------------------------------------");

        Iterator<Integer> integerIteratorone=integerMap.values().iterator();
        while(integerIteratorone.hasNext()){
            System.out.println("Integer value :: "+integerIteratorone.next());
        }
        Iterator<String> stringIteratorone=stringMap.values().iterator();
        while(stringIteratorone.hasNext()){
            System.out.println("String Value :: "+stringIteratorone.next());
        }

    }
}
