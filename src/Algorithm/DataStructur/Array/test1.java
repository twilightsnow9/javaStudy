package Algorithm.DataStructur.Array;

public class test1 {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addList(1);
        dynamicArray.addList(2);
        dynamicArray.addList(3);
        dynamicArray.addList(4);
        dynamicArray.addList(5);
        System.out.println(dynamicArray.get(0));
        System.out.println("============================");

        dynamicArray.add(2,5);
        System.out.println(dynamicArray.get(2));
        dynamicArray.remove(2);
        System.out.println("============================");
        dynamicArray.foreach((e) -> System.out.println(e));
    }
}
