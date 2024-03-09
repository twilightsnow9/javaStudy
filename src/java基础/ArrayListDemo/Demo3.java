package java基础.ArrayListDemo;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Stydu> stydus = new ArrayList<Stydu>();
        Stydu stydu1 = new Stydu("湖人",33);
        Stydu stydu2 = new Stydu("白人",22);
        stydus.add(stydu1);
        stydus.add(stydu2);
        for (int i = 0; i < stydus.size(); i++) {
            System.out.println(stydus.get(i).getName());
            System.out.println(stydus.get(i).getAge());
        }
    }
}
