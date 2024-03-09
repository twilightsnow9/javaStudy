package java基础.ArrayListDemo;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
//        集合定义包装类
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('a');
        System.out.println(list1.get(0));
    }
}
