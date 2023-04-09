
import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class GenericTest {
    public static void main(String[]args){
        Set<Integer> integerSet=new HashSet<Integer>();
        integerSet.add(Integer.valueOf(10));

        integerSet.add(Integer.valueOf(20));

        Set<String> stringSet=new HashSet<String>();
        stringSet.add("Hello World");
        stringSet.add("Hi World");

        for(Integer data:integerSet){
            System.out.println("Integer Value: "+data);
        }
        System.out.println("__________________________________________________________________");
        Iterator<String> stringIterator=stringSet.iterator();
        while (stringIterator.hasNext()){
            System.out.println("String Value: "+stringIterator.next());
        }
        System.out.println("__________________________________________________________________");
        for(String data:stringSet){
            System.out.println("String Value with foreach: "+data);
        }
        System.out.println("__________________________________________________________________");

    }
}

