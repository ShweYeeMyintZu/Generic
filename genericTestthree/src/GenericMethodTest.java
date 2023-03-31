public class GenericMethodTest {
    public static<E> void printArray(E[] inputArray){
        for(E e:inputArray){
            System.out.printf("%s",e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[]intarr={1,2,3,4,5};
        Double[]darr={1.1,2.2,3.3,1.4,5.5};
        Character[]carr={'H','E','L','L','O'};
        System.out.println("Arrray Integer contains ::");
        printArray(intarr);
        System.out.println("Double Array contains :: ");
        printArray(darr);
        System.out.println("Character Array contains :: ");
        printArray(carr);

    }
}
