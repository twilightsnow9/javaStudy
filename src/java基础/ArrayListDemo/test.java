package java基础.ArrayListDemo;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
//        创建ArrayList集合对象
//        泛型:限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<String>();

//        jdk7后
        ArrayList<String> list1 = new ArrayList<>();
//        添加元素
        list.add("a");
        list.add("abc");
        list.add("aabcde");

//        删除元素
        System.out.println(list.remove(0 ));


//        修改元素
//        返回覆盖的元素
        System.out.println(list.set(0,"aaa"));
        System.out.println(list);

//        查询元素
        System.out.println(list.get(1));
    }
}
