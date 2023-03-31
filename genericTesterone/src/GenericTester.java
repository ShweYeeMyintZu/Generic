public class GenericTester {
    public static void main(String[] args) {
        Box<Integer,String> box=new Box<Integer,String>();
        box.add(Integer.valueOf(10),"Hello Generic");
       System.out.println("T is used for first Generic Type and S is used for second Generic Type");
        System.out.println("Integer Value :: "+box.getFirst());
        System.out.println("String Value :: "+box.getSecond());
        System.out.println("-------------------------------------------------------------------------------------");

        Pair<String,Integer> pair=new Pair<String,Integer>();
        pair.addKeyValue("1", Integer.valueOf(10));
        System.out.println("K and V is used to represent parameter type of key and value of map");
        System.out.println("Integer Value ::"+pair.getValue("1"));
        System.out.println("-------------------------------------------------------------------------------------");

        CustomList<Box> list=new CustomList<Box>();
        list.addItem(box);
        System.out.println("E is mainly used by Java Collection Framework");
        System.out.println("Integer Value ::"+list.getItem(0).getFirst());
        System.out.println("String Value ::"+list.getItem(0).getSecond());
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
