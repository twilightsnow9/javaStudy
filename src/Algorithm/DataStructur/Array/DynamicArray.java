package Algorithm.DataStructur.Array;

import java.util.function.Consumer;

public class DynamicArray {
//    逻辑大小
    private int size;
//    容量
    private int capacity = 8;
//    动态数组
    private int[] array = {};

    public void addList(int e) {
        add(size,e);
    }

    public void add(int index,int e) {
        if (size == 0) {
            array = new int[capacity];
        }
        //    数组扩容
        extracted();
//        添加元素
        if (index >= 0 && index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = e;
        size++;
    }

    private void extracted() {
        if (size == capacity) { // 扩容
//          扩容1.5倍;
            capacity += capacity >> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    //    索引查询
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } return -1;
    }

//    遍历元素
    public void foreach(Consumer<Integer> consumer) { //使用内部类
        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
            consumer.accept(array[i]);
        }
    }
    public int remove(int index) {
        int removed = array[index];
        if (index < size - 1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        size--;
        return removed;
    }



}
