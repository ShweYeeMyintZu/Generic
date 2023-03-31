public class GenericTest {
    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>();
        box.addData(Integer.valueOf(10));
        System.out.println("Integer Value is :: "+box.getData());

        Box rawType=new Box();
        rawType=box;
        System.out.println("Integer Value from rawType :: "+rawType.getData());

        rawType.addData(50);
        System.out.println("Integer Value added from rawType "+rawType.getData());

        box=rawType;
        System.out.println("Integer Value from box :: "+box.getData());
    }
}
