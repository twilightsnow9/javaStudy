package Algorithm.Test.汉诺塔;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hanoitower {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            A.add(i + 1);
        }
        move(3,'A','B','C');


    }
//    汉诺塔问题
//    有三条柱子A，B，C
/*
    A柱上有五个从大到小排列的圆盘
    如何将A柱上的圆盘全部移到C柱子
    但是移动的时候只能移动小的
    且一次移动一个
 */
    public static void move(int n,char a,char b,char c){
//        n表示移动的个数
        if (n == 1) {
            System.out.println(a + "->"+ c);
        } else {
//            先把上面的盘从a移动到b借助c
            move(n - 1,a,c,b);
            System.out.println(a + "->"+ c);
            move(n - 1,b,a,c);
        }
    }

}
