package lqb;

import java.util.ArrayList;

public class Snake {
    public static void main(String[] args) {
        for (int i = 0; i < box().length; i++) {
            for (int j = 0; j < box()[i].length; j++) {
                System.out.print(box()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] box() {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int[][] start = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //        定义一个起点
                //        用一个数组记录起点的值
                start[i][j] = arr[i][j];
//                蛇有四种行动方式
//                但是行动是有条件的

                    if (i >= 0 && j >= 0) {
                        if (i < arr.length) {
//                上
                            i = i - 1;
//                        if (j > )
                            start[i][j + 1] = arr[i][j];
                            j = j + 1;
//                            try / catch
                        }

//                左
                        j = j + 1;
                        start[i][j + 1] = arr[i][j];
//                下
                        i = i + 1;
                        start[i][j + 1] = arr[i][j];
//                右
                        j = j - 1;
                        start[i][j + 1] = arr[i][j];
                    }
                }

            }


        return arr;
    }
}
